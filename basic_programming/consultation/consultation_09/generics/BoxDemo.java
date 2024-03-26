package generics;

public class BoxDemo {
    public static void main(String[] args) {
        Box<Paper> paperBox = new Box<>();

        //type inference - выведение типа
        // <> - diamond operator

        Box<Glass> glassBox = new Box<>();

        Box<Plastic> plasticBox = new Box<>();

        TwoCellBox<Plastic, Glass> twoCellBox = new TwoCellBox<>();



    }
}
