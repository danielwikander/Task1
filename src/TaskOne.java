import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Random;

public class TaskOne {

    public static void main(String[] args) {
        // Print man page if requested in args.
        if (args.length > 0 && (args[0].equals("-h") || args[0].equals("-help") || args[0].equals("help"))) {
            printManPage();
            return;
        }

        // Check if arguments have been provided, else prompt user to look at docs.
        if (args.length < 2) {
            System.out.println("TaskOne requires two arguments.");
            System.out.println("Execute 'TaskOne -h' for help.");
            return;
        }

        // Parse arguments, in order: n, filepath
        int n = 0;
        String filePath = null;
        try {
            n = Integer.parseInt(args[0]);
            filePath = args[1];
        } catch (Exception e) {
            System.err.println("Invalid arguments: " + e.getMessage());
            System.out.println("Execute 'TaskOne -h' for help.");
            return;
        }

        // Create/overwrite file
        BufferedWriter writer = null;
        try {
            File numberFile = new File(filePath);
            writer = new BufferedWriter(new FileWriter(numberFile));
        } catch (Exception e) {
            System.err.println("Could not create file: " + e.getMessage());
            System.out.println("Execute 'TaskOne -h' for help.");
            return;
        }

        // Write random number to n lines in file
        try {
            Random rand = new Random();
            for(int i = 0; i < n; i++) {
                writer.write(String.valueOf(rand.nextInt()));
                writer.newLine();
            }
            writer.close();
        } catch (Exception e) {
            System.err.println("Could not write numbers to file: " + e.getMessage());
            System.out.println("Execute 'TaskOne -h' for help.");
        }
    }

    public static void printManPage() {
        System.out.println(
            "NAME\n" +
            "    TaskOne - writes n lines of random numbers to file \n\n" +
            "SYNOPSIS \n" +
            "    TaskOne [ARGUMENT] [ARGUMENT] \n\n" +
            "DESCRIPTION\n" +
            "    Writes n lines of random numbers to file.\n" +
            "    Requires both arguments to run.\n" +
            "    Arguments must be written in the order: n, filePath.\n" +
            "    Existing files will be overwritten if given as an argument\n\n" +
            "ARGUMENTS\n" +
            "    n:        The number of lines to write to the file. Must be an integer.\n" +
            "    filePath: The path the the file to create/overwrite. Must be a valid filepath.\n\n" +
            "EXAMPLES\n" +
            "    TaskOne 10 newFile\n" +
            "        The file 'newFile' will be created and 10 lines will be written.\n" +
            "    TaskOne 25 testFile\n" +
            "        The file 'testFile' will be created and 25 lines will be written.\n");

    }
}

