package MVC;

public class DaoFactory {
    private static ProductsDAO productsDao;

    public static ProductsDAO getProductsDao(){
        if(productsDao == null) {
            productsDao = new ListProductsDAO(); //we would swap out the 'source' of the data here; e.g. producstDao = new MySQLProductsDAO()
        }

        return productsDao;
    }


}
