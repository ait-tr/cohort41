package code.task2;

import java.util.Map;

public class IncomeApp {
    public static void main(String[] args) {
        IncomeReader incomeReader = new IncomeReader();

        String path = "basic_programming/consultation/cons_17/code.task2/income.txt";
        String file1 = "basic_programming/consultation/cons_17/code.task2/less.txt";
        String file2 = "basic_programming/consultation/cons_17/code.task2/more.txt";

        Map<String,Integer> map = incomeReader.transferReader(path);
        incomeReader.writeResults(map,file1,file2);
    }
}
