package exo13;

import exo9.MyScanner;
import exo13.models.*;
import exo13.models.roles.OperatingSystem;
import exo13.models.roles.TypeSmartphone;

public class Exercice13 implements Runnable {
    @Override
    public void run() {
        MyScanner scanner = new MyScanner(System.in);
        Smartphone[] boardOfSmartphone = boardOfSmartphone(scanner);
        displayBoard(boardOfSmartphone);
        Smartphone[] sortBoard = sort(boardOfSmartphone);
        displaySortBoard(sortBoard);
        scanner.close();

    }

    public Smartphone createSmartphone(TypeSmartphone typeSmartphone, float price, OperatingSystem operatingSystem) {
        switch (typeSmartphone) {
            case APPLE_IPHONE_L:
                return new AppleIphoneL(typeSmartphone, price, operatingSystem);
            case APPLE_IPHONE_XS:
                return new AppleIphoneXS(typeSmartphone, price, operatingSystem);
            case GOOGLE_PIXEL:
                return new GooglePixel(typeSmartphone, price, operatingSystem);
            case SAMSUNG_GALAXY_5:
                return new SamsungGalaxy5(typeSmartphone, price, operatingSystem);
            case SAMSUNG_NOTE_3:
                return new SamsungNote3(typeSmartphone, price, operatingSystem);
            default:
                System.out.println("Erreur lors de la création du Smartphone");
                return null;
        }
    }

    public Smartphone[] boardOfSmartphone(MyScanner scanner) {
        int numberOfSmartphone = scanner.returnInt("Combien voulez-vous créer de smartphones ? (Saissisez un entier)");
        Smartphone[] boardOfSmartphone = new Smartphone[numberOfSmartphone];

        for (int i = 0; i < numberOfSmartphone; i++) {
            System.out.println("Création du Smartphone n°" + (i + 1));
            int choiceTypeSmartphone = scanner.returnInt("Indiquez son modèle en écrivant le chiffre correspondant : (Apple Iphone L (1), Apple Iphone XS (2), Google Pixel (3), Samsung Galaxy 5 (4), Samsung Note 3 (5)");
            TypeSmartphone typeSmartphone = choiceSmartphone(choiceTypeSmartphone);
            float price = scanner.returnFloat("Indiquez son prix :");
            int choiceOperatingSystem = scanner.returnInt("Indiquez son système d'exploitation (IOS(1) ou OS ANDROID(2))");
            OperatingSystem operatingSystem = choiceOperatingSystem(choiceOperatingSystem);
            boardOfSmartphone[i] = createSmartphone(typeSmartphone, price, operatingSystem);
        }
        return boardOfSmartphone;
    }

    public TypeSmartphone choiceSmartphone(int choiceTypeSmartphone) {
        switch (choiceTypeSmartphone) {
            case 1:
                return TypeSmartphone.APPLE_IPHONE_L;
            case 2:
                return TypeSmartphone.APPLE_IPHONE_XS;
            case 3:
                return TypeSmartphone.GOOGLE_PIXEL;
            case 4:
                return TypeSmartphone.SAMSUNG_GALAXY_5;
            case 5:
                return TypeSmartphone.SAMSUNG_NOTE_3;
            default:
                System.out.println("Erreur lors du choix du modèle de Smartphone.");
                return null;
        }
    }

    public OperatingSystem choiceOperatingSystem(int choiceOperatingSystem) {
        switch (choiceOperatingSystem) {
            case 1:
                return OperatingSystem.IOS;
            case 2:
                return OperatingSystem.OS_ANDROID;
            default:
                System.out.println("Erreur lors du choix du système d'exploitation.");
                return null;
        }
    }

    public void displayBoard(Smartphone[] board) {
        for (Smartphone smartphone : board) {
            smartphone.describeYourself();
        }
    }

    public Smartphone[] sort(Smartphone[] boardOfSmartphone) {
        Smartphone[] sortBoard = new Smartphone[boardOfSmartphone.length];
        for (int i = 0; i < boardOfSmartphone.length; i++) {
            Smartphone cheapest = getFirstAvailable(boardOfSmartphone, sortBoard);
            for (Smartphone smartphone : boardOfSmartphone) {
                if (smartphone.price < cheapest.price && !(isContain(sortBoard, smartphone))) {
                    cheapest = smartphone;
                }
            }
                sortBoard[i] = cheapest;
        }
        return sortBoard;
    }

    public boolean isContain(Smartphone[] sortBoard, Smartphone smartphone) {
        for (Smartphone isContain : sortBoard) {
            if (isContain!=null){
                if (isContain.equals(smartphone)) {
                    return true;
                }
            }
        }
        return false;
    }

    public void displaySortBoard(Smartphone[] board) {
        for (Smartphone smartphone : board) {
            if (smartphone!=null) {
                System.out.println(smartphone.typeSmartphone.name() + ", prix : " + smartphone.price + " euros");
            }
        }
    }

    public Smartphone getFirstAvailable(Smartphone[] boardOfSmartphone, Smartphone[] sortBoard){
        for(Smartphone s1 : boardOfSmartphone){
            boolean isSorted = false;
            for(Smartphone s2 : sortBoard){
                if (s2 != null)
                    if (s1.equals(s2)) {
                        isSorted = true;
                        break;
                    }
            }
            if (!isSorted) {
                return s1;
            }
        }
        System.out.println("Erreur");
    return null;
    }
}
