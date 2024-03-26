package methods;

import java.util.Scanner;

public class TermoService {


    public double tempRequest(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите температуру в градусах Цельсия: ");
        double tCelsium = scanner.nextDouble();

        return tCelsium;
    }

    public double converterCelsiumToFahrengeit(double tCelsium){
        double tFahrengeit = tCelsium * 1.8 +32;
        return tFahrengeit;
    }

    public void printInfo(double tFahrengeit){
        System.out.println("Температура в градусах по шкале Фаренгейта = " + tFahrengeit);

    }


}
