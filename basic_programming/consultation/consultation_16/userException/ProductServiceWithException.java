package userException;

public class ProductServiceWithException {

    ValidationServiceWithException validationService = new ValidationServiceWithException();

    public void addProduct(Product product){

        validationService.validate(product);

        System.out.println("Продукт успешно добавлен в базу данных");
    }
}
