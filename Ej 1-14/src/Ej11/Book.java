package Ej11;

public class Book extends Product{
    // 9. Luego, Book y Electronic deben sobrescribirlo con su propia lógica de descuento. 
    private String title;
    private double price;
    private double discount;

    public Book(String title){
        this.title = title;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public void setDiscount(double discount){
        this.discount = discount;
    }

    @Override
    public double getPrice(){
        double discountedPrice = (discount * price) / 100;
        price = price - discountedPrice;
        return price;
    }
}
