import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int n;

        // Parse first argument (n)
        try {
            n = Integer.parseInt(args[0]);
        } catch (NumberFormatException e) {
            System.err.println("Invalid first argument:" + e.getMessage());
        }
        // Parse second argument (filepath)
        try {
            String filepath = args[1];
        } catch (Exception e) {
            System.err.println("Invalid second argument: " + e.getMessage());
        }



    }

    public void parseArgs(String[] args, int n, String filepath) {


    }
}

