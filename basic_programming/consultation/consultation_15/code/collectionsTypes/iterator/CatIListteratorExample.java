package code.collectionsTypes.iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class CatIListteratorExample {
    public static void main(String[] args) {
        List<Cat> cats = new ArrayList<>();

        Cat murzik = new Cat("Murzik");
        Cat barsik = new Cat("Barsik");
        Cat begemot = new Cat("Begemot");
        Cat lastochka = new Cat("Lastochka");
        Cat lucky = new Cat("Lucky");

        Cat pushok = new Cat("Pushok");

        cats.add(murzik);
        cats.add(barsik);
        cats.add(lastochka);
        cats.add(begemot);
        cats.add(lucky);

        System.out.println(cats);



        // -------  with ListIterator -------

        ListIterator<Cat> catListIterator = cats.listIterator();

        while (catListIterator.hasNext()) {
            Cat tempCat = catListIterator.next();
            System.out.println(tempCat);

            if (tempCat.getName().equals("Begemot")){
                System.out.println("equal");
                catListIterator.remove();
                catListIterator.add(new Cat("Burbon"));
            }

        }

        System.out.println(cats);

        while (catListIterator.hasPrevious()){
            System.out.println(catListIterator.previous());
        }
    }
}
