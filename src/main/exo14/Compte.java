package main.exo14;

import java.util.Arrays;
import java.util.List;

public class Compte {
    private final long numero;
    private final String proprietaire;
    private final float solde;
    private final String dateOuverture;
    List<Operation> operationlist;


    public Compte(long numero, String proprietaire, float solde, String dateOuverture) {
        this.numero = numero;
        this.proprietaire = proprietaire;
        this.solde = solde;
        this.dateOuverture = dateOuverture;
    }

    public Compte(long numero, String proprietaire, float solde, String dateOuverture, Operation operation) {
        this.numero = numero;
        this.proprietaire = proprietaire;
        this.solde = solde;
        this.dateOuverture = dateOuverture;
        operationlist.add(operation);
    }

    public Compte(long numero, String proprietaire, float solde, String dateOuverture, Operation... operations) {
        this.numero = numero;
        this.proprietaire = proprietaire;
        this.solde = solde;
        this.dateOuverture = dateOuverture;
        operationlist.addAll(Arrays.asList(operations));
    }

    public String toString() {
        return "Compte n°" + numero + " ouvert le " + dateOuverture + " au nom de " + proprietaire + ".\nSon solde est actuellement de " + solde + "€";
    }

    public void browseList() {
        if (!(operationlist.isEmpty())) {
            System.out.println("La liste des opérations de ce compte est : ");
            for (Operation viewOperationList : operationlist) {
                System.out.println(viewOperationList);
            }
        }
    }

    public String verser(float montant, String date, String libelle) {
        Operation operation = new Operation(montant, libelle);
        operationlist.add(operation);
        float newSolde = (solde + montant);
        if (newSolde < 0) {
            return "Suite à l'opération portant le libellé :" + libelle + ", le nouveau solde du compte est de -" + newSolde + "€.";
        }
        return "Suite à l'opération portant le libellé :" + libelle + ", le nouveau solde du compte est de " + newSolde + "€.";
    }

    public String retirer(float montant, String libelle) {
        Operation operation = new Operation(montant, libelle);
        operationlist.add(operation);
        float newSolde = (solde - montant);
        if (newSolde < 0) {
            return "Suite à l'opération portant le libellé :" + libelle + ", le nouveau solde du compte est de -" + newSolde + "€.";
        }
        return "Suite à l'opération portant le libellé :" + libelle + ", le nouveau solde du compte est de " + newSolde + "€.";
    }

    public Operation newOperationRegister(float montant, String libelle){
        return newOperationRegister(montant, libelle);
    }

}

