import java.util.Random;

public class biasedshuffle {

    public static int[] biasedshuffle(int N) {
        int[] shuffled = new int[N];

        for (int i = 0; i < N; i++) {
            shuffled[i] = i + 1;
        }

        Random rand = new Random();

        for (int i = 0; i < N; i++) {
            int r = rand.nextInt(N);
            int temp = shuffled[i];
            shuffled[i] = shuffled[r];
            shuffled[r] = temp;
        }

        return shuffled;
    }

    public static void main(String[] args) {
        int[] result = biasedshuffle(10);
        for (int x : result) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
}