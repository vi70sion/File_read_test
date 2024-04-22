import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String filePath = "C:\\JavaTest\\example.csv";
        List<Automobilis> automobilisList = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(filePath);

            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
                String[] lineValues = line.split(",");
                lineValues = lineValues;
                automobilisList.add(new Automobilis(Integer.parseInt(lineValues[0]), lineValues[1],
                        lineValues[2], Integer.parseInt(lineValues[3])));
            }

            bufferedReader.close();
        } catch (IOException e) {
            System.err.println("Nepavyko skaityti failo: " + e.getMessage());
        }
        automobilisList= automobilisList;
    }
}