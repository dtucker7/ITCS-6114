import java.io.*;

public class ArgMin {
    public static void main(String[] args) {
        File fileInput = new File(args[0]);
        int n = Integer.parseInt(args[1]);
        int[] intArray = new int[n];

        // Initialize intArray prior to timed process
        try {
            BufferedReader fi = new BufferedReader(new FileReader(fileInput));
            String line;
            for (int i = 0; i < n; i += 1) {
                line = fi.readLine();
                if (line == null) {
                    System.out.printf("Only %,d lines in file. Please select a lesser n.", i + 1);
                    System.exit(1);
                }
                intArray[i] = Integer.parseInt(line);
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

        // Timing execution of min process (t1 - t0)
        long t0 = System.nanoTime();
        int argMin = intArray[0];
        for (int j = 1; j < n; j += 1) {
            if (intArray[j] < argMin) {
                argMin = intArray[j];
            }
        }
        long t1 = System.nanoTime();
        System.out.println(argMin);
        System.err.println((t1 - t0) / 1000000.);

    }
}
