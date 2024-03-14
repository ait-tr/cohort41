package userException;

import loop.UserInput;

import java.util.InputMismatchException;

public class ShopListApp {
    public static void main(String[] args) {

        ProductService service = new ProductService();
        UserInput ui = new UserInput();

        while (true) {
            try {
                System.out.println("Введите новый продукт.");
                String productName = ui.inputText("Введите название продукта:");
                Double productPrice = ui.inputDouble("Введите цену продукта:");

                Product newProduct = new Product(productName,productPrice);
                service.addProduct(newProduct);
            } catch (NumberFormatException e) {
                System.out.println("Incorrect number entered");
            } catch (InputMismatchException e) {
                System.out.println("Incorrect input type entered");
            }
        }
    }
}
