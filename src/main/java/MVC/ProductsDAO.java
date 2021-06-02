package MVC;

import java.util.List;

public interface ProductsDAO {

    List<Product> all(); //get all products
    void insert(Product product); //persist (insert/create) to the database



}
