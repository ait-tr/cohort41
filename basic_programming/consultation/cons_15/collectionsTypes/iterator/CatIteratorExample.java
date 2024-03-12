package collectionsTypes.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CatIteratorExample {
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

//        for (Cat tempCat : cats){
//            if (tempCat.getName().equals("Begemot")) {
//                cats.add(pushok);
//            }
//        }


        // -------  with Iterator -------

        Iterator<Cat> catIterator = cats.iterator();

        while (catIterator.hasNext()) {
            System.out.println(catIterator.next());
        }

        Iterator<Cat> catIterator2 = cats.iterator();

        while (catIterator2.hasNext()) {
            Cat tempCat = catIterator2.next();
            System.out.println(tempCat);

            if (tempCat.getName().equals("Begemot")){
                System.out.println("equal");
                catIterator2.remove();
            }
            System.out.println("Есть ли следующий элемент или нет? " + catIterator2.hasNext());
        }

        System.out.println(cats);
    }
}
