package code.userException;

public class ValidationService {
    /*
    проверка цены не меньше 0
     */
     public String validate(Product product){
         if (product.getPrice() < 0) {
             return "Цена продукта ошибочная";
         }

         return "Ok";
     }
}
