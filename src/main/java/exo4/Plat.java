package exo4;

import java.util.List;

public class Plat {
    public enum TypePlat {
        SNACK, DESSERT, RESISTANCE, ENTREE, BOISSON
    }
    private int id;
    private String nom;
    private float prix;
    private TypePlat typePlat;
    private List<Ingredient> ingredients;

    public Plat(int id, String nom, float prix, TypePlat typePlat, List<Ingredient> ingredients) {
        this.id = id;
        this.nom = nom;
        this.prix = prix;
        this.typePlat = typePlat;
        this.ingredients = ingredients;
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

    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    public TypePlat getTypePlat() {
        return typePlat;
    }

    public void setTypePlat(TypePlat typePlat) {
        this.typePlat = typePlat;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public boolean contientIngredient(Ingredient ingredient){
        return this.ingredients.contains(ingredient);
    }
}
