package main.exo25.presentation;

public class ScreenManager {
    private Screen currentScreen = null;

    public void display(Screen newScreen) {
        if(currentScreen != null) {
            separate();
        }
        currentScreen = newScreen;
        currentScreen.display();
    }

    private void separate(){
        System.out.println("");
        System.out.println("==================================");
        System.out.println("");
    }
}
