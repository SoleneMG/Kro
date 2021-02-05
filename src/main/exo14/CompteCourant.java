package main.exo14;

public class CompteCourant extends Compte{
    private float montantDecouvertAutorise;

    public CompteCourant(long numero, String proprietaire, float solde, String dateOuverture, float montantDecouvertAutorise) {
        super(numero, proprietaire, solde, dateOuverture);
        this.montantDecouvertAutorise = montantDecouvertAutorise;
    }

    @Override
    public String toString() {
        return "Le montant du découvert autorisé pour ce compte courant est de "+montantDecouvertAutorise+"€";
    }

    public float getMontantDecouvertAutorise() {
        return montantDecouvertAutorise;
    }

    public void setMontantDecouvertAutorise(float montantDecouvertAutorise) {
        this.montantDecouvertAutorise = montantDecouvertAutorise;
    }
}
