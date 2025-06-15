/*
Задача про здачу
Умова: Магазин видає здачу номіналами {50, 20, 10, 5, 1}.
Треба видати здачу сумою S з найменшою кількістю купюр.
 */
public class ChangeReturn {
    public static void main(String[] args) {
        int[] bills = {50, 20, 10, 5, 1};
        int S = 73;
        int sum = S;
        int count = 0;

        for (int i = 0; i < bills.length; i++) {
            while (sum >= bills[i]) {
                sum -= bills[i];
                System.out.println("Issued bill of denomination " + bills[i]);
                count++;
            }
        }

        System.out.println("Total bills issued: " + count);
    }
}
