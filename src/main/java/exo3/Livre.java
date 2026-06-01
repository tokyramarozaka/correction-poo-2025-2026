package exo3;

import java.time.LocalDate;
import java.util.List;

public class Livre {
    enum Genre {
        THRILLER, FANTASTIQUE, ROMANCE, POLICIER, SHONEN
    }
    private int id;
    private String titre;
    private int nbPages;
    private LocalDate dateDeParution;
    private String resume;
    private Auteur auteur;
    private List<Genre> genres;

    public Livre(int id, String titre, int nbPages, LocalDate dateDeParution, List<Genre> genres, String resume, Auteur auteur) {
        this.id = id;
        this.titre = titre;
        this.nbPages = nbPages;
        this.dateDeParution = dateDeParution;
        this.genres = genres;
        this.resume = resume;
        this.auteur = auteur;
    }

    public Auteur getAuteur() {
        return auteur;
    }

    public void setAuteur(Auteur auteur) {
        this.auteur = auteur;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public int getNbPages() {
        return nbPages;
    }

    public void setNbPages(int nbPages) {
        this.nbPages = nbPages;
    }

    public LocalDate getDateDeParution() {
        return dateDeParution;
    }

    public void setDateDeParution(LocalDate dateDeParution) {
        this.dateDeParution = dateDeParution;
    }

    public String getResume() {
        return resume;
    }

    public void setResume(String resume) {
        this.resume = resume;
    }

    public List<Genre> getGenres() {
        return genres;
    }

    public void setGenres(List<Genre> genres) {
        this.genres = genres;
    }

    @Override
    public String toString() {
        return "Livre{" + this.titre + " (" + this.genres + ")}";
    }
}
