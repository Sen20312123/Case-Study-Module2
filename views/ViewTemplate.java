package views;

import java.util.Scanner;

public abstract class ViewTemplate {
    protected Scanner scanner = new Scanner(System.in);
    public void showMenu() {
        System.out.println("Logo");
        System.out.println("Welcome to MieuMieu Shop");
    }

    public void showFooter() {
        System.out.println("@Copy TanDung Company");
    }

    public abstract void showBody();

    public void showPage() {
        showMenu();
        showBody();
        showFooter();
    }
}
