package service;

import model.Product;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;

public class ProductService {
    private static ArrayList<Product> products = new ArrayList<>();

    static {
        Date createAt = new Date();
        Instant updateAt = Instant.now();

        products.add(new Product(1667182235L, "Iphone 11", 20000, 2, "Apple", createAt, updateAt));
        products.add(new Product(1667182236L, "Iphone 12", 20000, 2, "Apple", createAt, updateAt));
        products.add(new Product(1667182237L, "Iphone 13", 20000, 2, "Apple", createAt, updateAt));
        products.add(new Product(1667182238L, "Iphone 14", 20000, 2, "Apple", createAt, updateAt));
        products.add(new Product(1667182239L, "Iphone X", 20000, 2, "Apple", createAt, updateAt));

    }

//    public ProductService() {
//    }


    public ArrayList<Product> getProducts() {
        return products;
    }

    public void addProduct(Product product){
        ProductService.products.add(product);
    }

    public Product getProductById(Long id){
        for(Product pro : ProductService.products){
            if(pro.getId().equals(id)){
                return pro;
            }
        }
        return null;
    }
    public void removeProduct(Product product) {
        ProductService.products.remove(product);
    }

    public void removeProductById(Long idProduct) {
        for (int i = 0; i < ProductService.products.size(); i++) {
            if (ProductService.products.get(i).getId().equals(idProduct)) {
                ProductService.products.remove(i);
                break;

            }
        }
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

}
