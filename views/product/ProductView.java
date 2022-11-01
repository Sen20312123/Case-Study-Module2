package views.product;

import model.Product;

public class ProductView extends ProductTemplate {
    public ProductView(){

    }
    @Override
    public void showBody() {
        for (Product product : productService.getProducts()) {
            System.out.println(product);
        }
    }
}
