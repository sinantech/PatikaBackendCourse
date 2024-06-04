public interface ProductManagement {
    void listAll();
    boolean delete(int ID);
    boolean add(Product product);
    void listByBrand(String brandName);


}
