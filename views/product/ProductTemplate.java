package views.product;

import model.Product;
import views.ViewTemplate;
import service.ProductService;

import java.util.List;

public abstract class ProductTemplate extends ViewTemplate {
    protected ProductService productService;
    public ProductTemplate(){
        productService = new ProductService();
    }
    public void showProducts(List<Product> list){
        for(Product product : list){
            System.out.println(product);
        }
    }
}
