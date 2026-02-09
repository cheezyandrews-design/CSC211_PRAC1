import java.util.Random;
import java.util.HashMap;

public class unbiasedshuffle {

    public static int[] unbiasedshuffle(int N) {
        int[] B = new int[N];

        for (int i = 0; i < N; i++) {
            B[i] = i + 1;
        }

        Random rand = new Random();
        int b = 0;

        while (b < N) {
            int r = b + rand.nextInt(N - b);
            int temp = B[b];
            B[b] = B[r];
            B[r] = temp;
            b++;
        }

        return B;
    }

    public static void testShuffle() {
        HashMap<String, Integer> counts = new HashMap<>();

        for (int i = 0; i < 60000; i++) {
            int[] B = unbiasedshuffle(3);
            String key = "" + B[0] + B[1] + B[2];

            counts.put(key, counts.getOrDefault(key, 0) + 1);
        }

        for (String key : counts.keySet()) {
            System.out.println(key + " " + counts.get(key));
        }
    }

    public static void main(String[] args) {
        testShuffle();
    }
}