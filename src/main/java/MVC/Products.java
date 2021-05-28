package MVC;

import java.util.List;

public interface Products {

    List<Product> all(); //get all products
    void insert(Product product); //persist (insert/create) to the database



}
