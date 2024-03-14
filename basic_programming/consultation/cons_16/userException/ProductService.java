package userException;

public class ProductService {

    ValidationService validationService = new ValidationService();

    public void addProduct(Product product){

        String validationResult = validationService.validate(product);

        if (validationResult.equals("Ok")) {
            System.out.println("Продукт успешно добавлен в базу данных");
        } else {
            System.out.println("Ошибка валидации данных");
        }
    }
}
