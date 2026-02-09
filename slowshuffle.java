import java.util.Random;

public class slowshuffle {

    public static int[] slowshuffle(int N) {
        int[] shuffled = new int[N];
        boolean[] isNotPresent = new boolean[N + 1];

        for (int i = 1; i <= N; i++) {
            isNotPresent[i] = true;
        }

        Random rand = new Random();
        int i = 0;

        while (i < N - 1) {
            int r = 1 + rand.nextInt(N);
            if (isNotPresent[r]) {
                shuffled[i] = r;
                isNotPresent[r] = false;
                i++;
            }
        }

        
        for (int r = 1; r <= N; r++) {
            if (isNotPresent[r]) {
                shuffled[N - 1] = r;
                break;
            }
        }

        return shuffled;
    }

    public static void main(String[] args) {
        int[] result = slowshuffle(10);
        for (int x : result) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
}