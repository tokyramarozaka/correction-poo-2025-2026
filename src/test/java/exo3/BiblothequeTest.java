package exo3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BiblothequeTest {
    private Biblotheque biblotheque;
    private Auteur auteurDisney;
    private Livre simba;
    private Livre fourthWing;

    @BeforeEach
    void setUp() {
        biblotheque = new Biblotheque(1, "Analakely", "Tana", "Antananarivo");
        auteurDisney = new Auteur(1, "Disney", "Rak", "Walt disney", LocalDate.of(1956, 01, 03),
                Auteur.Genre.AUTRE, "Etats-unis");
        simba = new Livre(1, "Simba: Le roi lion", 200, LocalDate.of(1999, 10, 07),
                List.of(Livre.Genre.FANTASTIQUE), "Les aventures de Simba et Nala", auteurDisney);
        fourthWing = new Livre(2, "Fourth wing", 400, LocalDate.of(2016, 9, 9),
                List.of(Livre.Genre.ROMANCE, Livre.Genre.FANTASTIQUE), "Histoire de dragons", auteurDisney);
    }

    @Test
    void test_ajouter_livre_ok() {
        biblotheque.ajouterLivre(simba);

        assertEquals(1, biblotheque.getLivres().size());
        assertEquals(simba, biblotheque.getLivres().getFirst());
    }

    @Test
    void test_ajouter_livre_nul_ko(){
        var erreur = assertThrows(IllegalArgumentException.class, () -> biblotheque.ajouterLivre(null));
        assertEquals("Le livre ne peut pas être null",
                erreur.getMessage());
    }

    @Test
    void test_retirer_livre_existant_ok() {
        this.biblotheque.ajouterLivre(simba);
        this.biblotheque.ajouterLivre(fourthWing);
        this.biblotheque.retirerLivreParId(1);
        assertEquals(1, this.biblotheque.getLivres().size());
        assertFalse(this.biblotheque.getLivres().contains(simba));
    }

    @Test
    void test_trier_livre_croissant() {
        this.biblotheque.ajouterLivre(simba);
        this.biblotheque.ajouterLivre(fourthWing);

        var listeTriee = biblotheque.livresTrieParTitreCroissant();

        assertEquals(fourthWing, listeTriee.get(0));
        assertEquals(simba, listeTriee.get(1));
    }

    @Test
    void test_rechercher_par_mot_cle_ok() {
        this.biblotheque.ajouterLivre(simba);
        this.biblotheque.ajouterLivre(fourthWing);

        var resultat = biblotheque.chercherParMotCle("simba");
        var resultatFacile = biblotheque.chercherParMotCle("a");

        assertTrue(resultat.contains(simba));
        assertFalse(resultat.contains(fourthWing));
        assertTrue(resultatFacile.contains(simba));
        assertTrue(resultatFacile.contains(fourthWing));
    }

    @Test
    void test_rechercher_par_titre_ok() {
        this.biblotheque.ajouterLivre(simba);
        this.biblotheque.ajouterLivre(fourthWing);

        var resultat = biblotheque.chercherParTitre("wing");

        assertTrue(resultat.contains(fourthWing));
        assertFalse(resultat.contains(simba));
    }
}