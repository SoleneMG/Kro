package exo14;

import java.util.Date;

public class Operation {
    final float montant;
    final Date date;
    final String libelle;

    public Operation(float montant, String libelle) {
        this.montant = montant;
        this.date = new Date();
        this.libelle = libelle;
    }

    public String toString() {
        return date + " | " + libelle + " | " + montant + " €";
    }
}
