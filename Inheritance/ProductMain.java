class Product {
    String productName;
    double price;

    void showProduct(){
        System.out.println("Product:" + productName);
        System.out.println("Price:"+ price);

    }
}
class Electronics extends Product{
    String brand;

    void showDetails(){

    showProduct();
    System.out.println("Brand:" + brand);
    }
}
class  ProductMain{
    public static void main(String[] args)
    {
        Electronics e = new Electronics();
        e.productName = "Laptop";
        e.price = 60000;
        e.brand = "Asus";

        e.showDetails();
    }
}