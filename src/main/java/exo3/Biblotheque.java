package exo3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Biblotheque {
    private int id;
    private String nom;
    private String adresse;
    private String ville;
    private List<Livre> livres;

    public Biblotheque(int id, String nom, String adresse, String ville) {
        this.id = id;
        this.nom = nom;
        this.adresse = adresse;
        this.ville = ville;
        this.livres = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public List<Livre> getLivres() {
        return livres;
    }

    public void setLivres(List<Livre> livres) {
        this.livres = livres;
    }

    public Livre ajouterLivre(Livre livre) {
        if (livre == null) {
            throw new IllegalArgumentException("Le livre ne peut pas être null");
        }
        this.livres.add(livre);
        return livre;
    }

    public Livre retirerLivreParId(int id) {
        var existeDansLaBibliotheque = this.livres.stream()
                .anyMatch(livre -> livre.getId() == id);
        if (!existeDansLaBibliotheque) {
            throw new IllegalArgumentException("L'id que vous avez donné n'existe pas dans la bibliotheque " + this.nom);
        }
        var livreARetirer = this.livres.stream()
                .filter(livre -> livre.getId() == id)
                .findFirst()// Optional: valeur qui peut être un livre / null
                .get();
        this.livres.removeIf(livre -> livre.getId() == id);
        return livreARetirer;
    }

    public List<Livre> livresTrieParTitreCroissant(){
        return this.livres.stream()
                .sorted(Comparator.comparing(Livre::getTitre))
                .collect(Collectors.toList());
    }
}
