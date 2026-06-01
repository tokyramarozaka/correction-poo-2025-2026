package exo3;

import java.time.LocalDate;

public class Auteur {
    enum Genre {
        MASCULIN, FEMININ, AUTRE
    }
    private int id;
    private String prenom;
    private String nom;
    private String nomAuteur;
    private LocalDate dateDeNaissance;
    private Genre genre;
    private String pays;

    public Auteur(int id, String prenom, String nom, String nomAuteur, LocalDate dateDeNaissance, Genre genre, String pays) {
        this.id = id;
        this.prenom = prenom;
        this.nom = nom;
        this.nomAuteur = nomAuteur;
        this.dateDeNaissance = dateDeNaissance;
        this.genre = genre;
        this.pays = pays;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getNomAuteur() {
        return nomAuteur;
    }

    public void setNomAuteur(String nomAuteur) {
        this.nomAuteur = nomAuteur;
    }

    public LocalDate getDateDeNaissance() {
        return dateDeNaissance;
    }

    public void setDateDeNaissance(LocalDate dateDeNaissance) {
        this.dateDeNaissance = dateDeNaissance;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }
}
