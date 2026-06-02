package exo4;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public record Commande(int id, LocalDateTime dateHeureCommande, Client client, List<PlatCommande> platsCommandes) {
    public Commande fusionnerCommande(Commande autreCommande) {
        var platsCommandesFusionnes =  new ArrayList<PlatCommande>();
        platsCommandesFusionnes.addAll(this.platsCommandes);
        for (PlatCommande platsCommande : autreCommande.platsCommandes) {
            if (platsCommandesFusionnes.contains(platsCommande)) {
                // A completer et a tester
            } else {
                // A completer et a tester
            }
        }
        return new Commande(3, LocalDateTime.now(),
                this.client,
                platsCommandesFusionnes);
    }
}
