package main.exo25.presentation;

import main.exo9.MyScanner;

public abstract class Screen {
    protected final ScreenManager screenManager;
    protected final MyScanner myScanner;

    public Screen(ScreenManager screenManager, MyScanner myScanner){
        this.screenManager = screenManager;
        this.myScanner = myScanner;
    }
    public abstract void display();
}
