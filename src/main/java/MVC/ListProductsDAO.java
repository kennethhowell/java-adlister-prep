package MVC;

import java.util.ArrayList;
import java.util.List;

public class ListProductsDAO implements ProductsDAO {

    //named ListProductsDAO because it is IN MEMORY - using a LIST data type (List + ProductsDAO)
    private List<Product> products = new ArrayList<>();

    //Make a method to populate the instantiated arraylist
    public ListProductsDAO(){
        insert(new Product("hammer drill", 40.99));
        insert(new Product("hammer", 12.99));
        insert(new Product("screwdriver", 6.99));
    }

    @Override
    public List<Product> all() {
        return this.products;
    }

    @Override
    public void insert(Product product) {
        this.products.add(product);
    }
}
