package views.product;

import service.ProductService;
import views.ViewTemplate;

public class RemoveProductView extends ProductTemplate {
    private ProductService productService;

    public RemoveProductView(){
        productService = new ProductService();
    }
    public void showBody() {
        System.out.println("DELETE PRODUCT VIEW");
        showProducts(productService.getProducts());
        System.out.println("Input ID:");
        Long idProduct = Long.parseLong(scanner.nextLine());
        productService.removeProductById(idProduct);
        showProducts(productService.getProducts());
    }
}
