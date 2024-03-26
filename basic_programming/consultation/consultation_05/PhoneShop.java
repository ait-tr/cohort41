public class PhoneShop {
    public static void main(String[] args) {
        Phone phone1 = new Phone("Apple", "iPhone 15 Max Pro", "White", 6.7, 1500);
        Phone phone2 = new Phone("Samsung", "Galaxy ", "Black", 6.5, 1300);
        Phone phone3 = new Phone("Huawei", "P30", "Silver", 6.4, 1100);



        System.out.println(phone1.model);
        System.out.println(phone2.price);
        System.out.println(phone3.producer);

        System.out.println("--------------");

        Phone[] phones = new Phone[3];

        phones[0] = phone1;
        phones[1] = phone2;
        phones[2] = phone3;


        for (int i = 0; i < phones.length; i++) {
            System.out.println("Телефон на витрине:");
            System.out.println("Производитель: " + phones[i].producer);
            System.out.println("Модель: " + phones[i].model);
            System.out.println("Цвет: " + phones[i].color);
            System.out.println("Диагональ: " + phones[i].size);
            System.out.println("Цена: " + phones[i].price);
            System.out.println("-----------------------");

        }

        phones[0].price = 1400;

        phones[0].setPriceWithDiscount(10);

        System.out.println(phone1.price);

    }
}
