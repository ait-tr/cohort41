package methods;

import java.util.Scanner;

public class TermometerCalcWithMethods {
    public static void main(String[] args) {

        TermoService service = new TermoService();

        double temp = service.tempRequest();
        double fahr = service.converterCelsiumToFahrengeit(temp);
        service.printInfo(fahr);

    }

}
