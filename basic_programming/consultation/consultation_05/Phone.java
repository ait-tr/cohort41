

public class Phone {
    String producer;
    String model;
    String color;
    double size;
    double price;

    public Phone(String producer, String model, String color, double size, double price) {
        this.producer = producer;
        this.model = model;
        this.color = color;
        this.size = size;
        this.price = price;
    }

    public  void setPriceWithDiscount(int discount){
        price = price * (100 - discount) / 100;
    }


}
