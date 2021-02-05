package main.exo25.presentation;

import main.exo25.domain.register.RegisterLogic;
import main.exo25.domain.register.RegisterPersonResult;
import main.exo9.MyScanner;
import main.exo25.Exercice25;

public class RegisterScreen extends Screen{
    private final RegisterLogic registerLogic = new RegisterLogic(Exercice25.database);

    public RegisterScreen(ScreenManager screenManager, MyScanner myScanner) {
        super(screenManager, myScanner);
    }

    @Override
    public void display() {
        RegisterPersonResult result = registerPerson();
        displayResult(result);

        //personne enregistrée
        //personne existe déjà
        //personne trop vieille
        //age invalide
        //nom vide
        //prenom vide
    }

    private RegisterPersonResult registerPerson(){
        String lastName = myScanner.returnString("Donne moi ton tit nom:");
        String firstName = myScanner.returnString("Donne moi ton prénom:");
        int age = myScanner.returnInt("Donne moi ton age:");

        return registerLogic.addPerson(lastName,firstName,age);
    }

    private void displayResult(RegisterPersonResult result){
        switch (result){
            case SUCCESS:
                System.out.println("Personne enregistrée");
                break;
            case AGE_INVALID:
                System.out.println("Age invalide");
                break;
            case TOO_OLD:
                System.out.println("Va plutot au cimetière");
                break;
            case ALREADY_EXIST:
                System.out.println("On accepte pas les clones");
                break;
            case FIRSTNAME_EMPTY:
                System.out.println("Apprends à écrire ton prénom");
                break;
            case LASTNAME_EMPTY:
                System.out.println("Apprends à écrire ton nom");
                break;
            default:
                throw new IllegalArgumentException("RegisterPersonResult not displayed "+result);
        }

        screenManager.display(new MenuScreen(screenManager,myScanner));
    }
}
