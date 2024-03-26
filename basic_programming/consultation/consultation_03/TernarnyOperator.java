public class TernarnyOperator {
    public static void main(String[] args) {

        int x = 10;

        String textMessage = "";

      if (x > 0)  {
           textMessage = "число - положительное";
      } else {
           textMessage = "число - отрицательное";
      }

        System.out.println(textMessage);


        textMessage = (x > 0) ? "число - положительное" : "число - отрицательное";

        // result = (condition) ? valueOfTrue : valueOfFalse;
    }
}
