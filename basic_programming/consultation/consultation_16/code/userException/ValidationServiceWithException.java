package code.userException;

public class ValidationServiceWithException {
    /*
    проверка цены не меньше 0
     */
     public void validate(Product product){

         String error = "";

         if (product.getPrice() < 0) {
             error = "Цена продукта ошибочная";
         }

         if (!error.isEmpty()) {
             throw new ProductValidationException(error);
         }
     }
}
