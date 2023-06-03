import java.io.*;

public class ExportData {

    public void save(Data data) {
        String fileName = data.getFirstName();
        try {
            PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(fileName + ".txt", true)));
            out.println(data);
            System.out.println("Export completed!");
            out.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

}