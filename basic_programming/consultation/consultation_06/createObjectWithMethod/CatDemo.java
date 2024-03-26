
package createObjectWithMethod;

public class CatDemo {
    public static void main(String[] args) {

        CatService service = new CatService();

        Cat myCat = service.createCat();

        System.out.println("у нас новая кошка: "  + myCat);

        myCat.setName("Барсик");

        System.out.println("Теперь нашу кошку зовут: " + myCat);




    }
}
