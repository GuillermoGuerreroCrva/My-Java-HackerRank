import java.io.*;

public class JavaLoopV1 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());
        int i = 1;
        int size = N * 10;

        for (int j = 1; j <= size; j++) {
            int result = 0;
            result = N * i;
            System.out.println(N + " x " + i + " = " + result);
            i++;
            if (result == size) {
                System.exit(0);
            }
        }

        bufferedReader.close();
    }
}
