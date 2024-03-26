package createObjectWithMethod;

import java.util.Scanner;

public class CatService {

    public Cat createCat(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите имя кошки:");
        String catName = scanner.nextLine();

        Cat newCat = new Cat(catName);

        return newCat;
    }

}
