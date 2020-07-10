import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;

public class NumberGenerator {

    NumberGenerator(int n, String filePath) {
        // Create/overwrite file
        File numberFile = createFile(filePath);

        // Fill file with numbers
        fillFileWithNumbers(n, numberFile);
    }


    private File createFile(String filePath) {
        File numberFile = null;
        try {
            numberFile = new File(filePath);
        } catch (Exception e) {
            System.err.println("Could not create file:" + e.getMessage());
        }
        if (numberFile.isFile()) {
            return numberFile;
        } else {
            throw FileNotFoundException
        }
        return numberFile;
    }

    private void fillFileWithNumbers(int n, File numberFile) {

        Random rand = new Random();
        int randomNumber = rand.nextInt();
    }
}
