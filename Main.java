import views.ViewTemplate;
import views.product.AddProductView;
import views.product.ProductView;
import views.product.RemoveProductView;

import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        ViewTemplate viewPage = null;
        boolean flagMenu = true;
        do{
            System.out.println("Menu: ");
            System.out.println("1: Add Product");
            System.out.println("2: Show List Product");
            System.out.println("3: Remove Product");
            System.out.println("0: Exit");
            int menu = Integer.parseInt(scanner.nextLine());
            switch (menu) {
                case 1:
                    viewPage = new AddProductView();
                    break;
                case 2:
                    viewPage = new ProductView();
                    break;
                case 3:
                    viewPage = new RemoveProductView();
                    break;
                case 0:
                    flagMenu = false;
                    break;
            }
            viewPage.showPage();

        }while (flagMenu);

    }
}