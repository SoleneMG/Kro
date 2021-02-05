package main.exo14;

public class CompteEpargne extends Compte {
    private float taux;

    public CompteEpargne(long numero, String proprietaire, float solde, String dateOuverture, float taux, Operation... operationList) {
        super(numero, proprietaire, solde, dateOuverture, operationList);
        this.taux = taux;
    }

    @Override
    public String toString() {
        return "Le taux en vigueur sur ce compte épargne est de "+taux+"%.";
    }

    public float getTaux() {
        return taux;
    }

    public void setTaux(float taux) {
        this.taux = taux;
    }
}
