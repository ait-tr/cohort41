package transport;
/*
@date 16.02.2024
@author Sergey Bugaienko
*/

public class Airplane extends Transport implements Flyable{

    public Airplane(int capacity) {
        super(capacity);
    }

    @Override
    void takePassenger() {
        System.out.println("Самолет берет на борт пассажира");
    }

    @Override
    public void fly() {
        System.out.println("Самолет летит с пассажирами");
    }
}
