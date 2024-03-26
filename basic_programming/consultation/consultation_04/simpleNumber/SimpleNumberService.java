package simpleNumber;

public class SimpleNumberService {

    public boolean checkSimple(int number){

        for (int i = 2; i < number; i++) {
            if (number % i == 0){
                return false;
            }
        }

        return true;
    }
}
