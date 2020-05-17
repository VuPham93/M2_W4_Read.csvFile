import java.io.*;

public class readCSVFile {
    public static void main(String[] args) {
        File file = new File("country.csv");
        String line = "";

        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));

            while ((line = reader.readLine()) != null) {
                String[] country = line.split(",");
                System.out.println("Country [ip range: " + country[1] + " - " + country[2] + ", IPv4 = " + country[3] + ", code= " + country[4] + " , name=" + country[5] + "]");
            }

        } catch (FileNotFoundException e) {
            System.err.println("File not found or can't read file!");
        } catch (IOException e) {
            System.err.println("An error occurred while copy.");
        }

    }
}
