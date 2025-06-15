/*
Умова:
Є гирі {1, 3, 3, 5, 9}.
Потрібно набрати масу W, використовуючи найменшу кількість гир.
 */
public class WeightBalance {
    public static void main(String[] args) {
        int[] weights = {9, 5, 3, 3, 1};
        int W = 11;
        int count = 0;

        for (int i = 0; i < weights.length; i++) {
            while (W >= weights[i]) {
                W -= weights[i];
                count++;
                System.out.println("Taken a weight of " + weights[i]);
                System.out.println("Remaining to collect: " + W);
            }
        }

        System.out.println("Weights used: " + count);
    }
}

