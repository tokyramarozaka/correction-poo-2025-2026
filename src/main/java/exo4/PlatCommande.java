package exo4;

public record PlatCommande(
        int id,
        Plat plat,
        Commande commande,
        int quantite
) {}
