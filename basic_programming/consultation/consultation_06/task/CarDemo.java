package task;

public class CarDemo {
    public static void main(String[] args) {
        Car myCar = new Car("Mercedes", "GLC 250", "dark blue");

        boolean isEngineWork = myCar.startEngine();

        if (isEngineWork){
        myCar.beep("ОСТОРОЖНО! Двигатель работает!!!!");
        } else {
            System.out.println("Двигатель не завелся!");
        }

        if (isEngineWork) {
        myCar.stopEngine();
        }else {
            System.out.println("Вызываем аварийку!");
        }



    }
}
