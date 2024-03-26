package code.task2;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class IncomeReader {

    public  Map<String, Integer>  transferReader(String path) {

        Map<String, Integer> userTransfers = new HashMap<>();


        try {
            BufferedReader reader = new BufferedReader(new FileReader(path));

            String line;

            while ((line = reader.readLine()) != null) {
                String[] lineParts = line.split(":");
                String user = lineParts[0].trim();
                int amount = Integer.parseInt(lineParts[1].trim());

                if (userTransfers.get(user) == null) {
                    userTransfers.put(user, amount);
                } else {
                    userTransfers.put(user, userTransfers.get(user) + amount);
                }

                //userTransfers.merge(user, amount, Integer::sum);

            }
        } catch (IOException e) {

        }

        return userTransfers;
    }


    public void writeResults(Map<String, Integer> userTransfers, String fileName1, String fileName2) {

        try {
            BufferedWriter less = new BufferedWriter(new FileWriter(fileName1));
            BufferedWriter more = new BufferedWriter(new FileWriter(fileName2));

            for (Map.Entry<String, Integer> entry : userTransfers.entrySet()) {
                String user = entry.getKey();
                int total = entry.getValue();

                if (total < 2000) {
                    less.write(user  + ":" + total);
                    less.newLine();
                } else {
                    more.write(user  + ":" + total);
                    more.newLine();
                }
            }
            less.close();
            more.close();
        } catch (IOException e) {}

    }
}
