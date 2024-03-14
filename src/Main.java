import java.io.*;
public class Main {
    public static void main(String[] args) {
        String inputFilePath = "input.txt";
        String outputFilePath = "output.txt";

        try {
            BufferedReader fileread = new BufferedReader(new FileReader(inputFilePath));
            BufferedWriter writefile = new BufferedWriter(new FileWriter(outputFilePath));
            String line;
            while ((line = fileread.readLine()) != null) {
                String replacedLine = line.replaceAll("Nha Trang", "Vũng Tàu");
                writefile.write(replacedLine);
            }
            fileread.close();
            writefile.close();
        } catch (IOException e) {
            System.out.println("Xảy ra lỗi khi đọc hoặc ghi file: ");
        }
    }
}
