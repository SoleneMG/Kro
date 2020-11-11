package exo10;

import exo9.MyScanner;

public class Exercice10 implements Runnable {
    @Override
    public void run() {
        MyScanner scanner = new MyScanner(System.in);
        Form[] board = createABoard(scanner);
        selectionFormToCompare(scanner, board);
    }

    public Form createAForm(MyScanner scanner) {
        int createYourForm = scanner.returnInt("Quelle forme souhaitez-vous créer ? Choisissez parmis ces propositions : Cercle (1), Carré (2), Rectangle (3) ");
        switch (createYourForm) {
            case 1:
                System.out.println("Vous avez choisi de créer un cercle.");
                double ray = scanner.returnDouble("Veuillez saisir la valeur de son rayon.");
                return new Circle(ray);
            case 2:
                System.out.println("Vous avez choisi de créer un carré.");
                double side = scanner.returnDouble("Veuillez saisir la valeur de son côté.");
                return new Square(side);
            case 3:
                System.out.println("Vous avez choisi de créer un rectangle.");
                double length = scanner.returnDouble("Veuillez saisir la valeur de sa longueur.");
                double width = scanner.returnDouble("Veuillez saisir la valeur de sa largeur.");
                if (isSmaller(length, width)) {
                    return new Rectangle(length, width);
                } else {
                    int answer = scanner.returnInt("Vous avez saisi une valeur plus grande pour la largeur que pour la longueur, Souhaitez-vous inverser les valeurs saisies ? Oui (1), Non (2), Annuler (3)");
                    switch (answer) {
                        case 1:
                            double inversion = length;
                            length = width;
                            width = inversion;
                            return new Rectangle(length, width);
                        case 2:
                            System.out.println("La forme que vous souhaitez créer n'existe pas. Aucune forme n'a été créée.");
                            return null;
                        default:
                            System.out.println("Abandon, aucune forme n'a été créée.");
                            return null;
                    }
                }
            default:
                System.out.println("Saisie incorrecte, aucune forme n'a été créée.");
        }
        return null;
    }

    public boolean isSmaller(double length, double width) {
        return width < length;
    }

    public Form[] createABoard(MyScanner scanner) {
        boolean createAForm = scanner.returnBoolean("Voulez-vous créer un tableau de formes ?");
        if (createAForm) {
            int index = scanner.returnInt("Saisissez un nombre entier qui définira la longueur de votre tableau :");
            Form[] board = new Form[index];
            System.out.println("Vous avez créé un tableau de " + index + " de longueur.");
            for (int i = 0; i < board.length; i++) {
                System.out.println("Forme " + (i + 1) + " sur " + board.length + " :");
                board[i] = createAForm(scanner);
            }
            System.out.println("Voici le contenu de votre tableau de formes :");
            for (Form form : board) {
                System.out.println(form.display());
            }
            return board;
        } else System.out.println("Au revoir !");
        return null;
    }

    public void selectionFormToCompare(MyScanner scanner, Form[] board) {
        System.out.println("Quelles formes souhaitez-vous comparer ?");
        int answerForm1 = scanner.returnInt("Veuillez séléctionner la première forme à comparer :");
        if (answerForm1 <= board.length) {
            int answerForm2 = scanner.returnInt("Veuillez séléctionner la deuxième forme à comparer :");
            if(CompareForm.formCanContains(board[answerForm1], board[answerForm2])){
            System.out.println("La deuxième forme peut contenir la première.");
            } else System.out.println("La deuxième forme ne peut pas contenir la première.");
        } else System.out.println("La forme n'est pas dans le tableau.");
    }

}
