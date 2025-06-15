
/*
Задача про графік уроків
Умова: Вибрати максимальну кількість неперетинаючихся уроків.
 */
public class LessonSchedule {
    public static void main(String[] args) {
        int[] start = {1, 2, 4, 6};
        int[] end   = {3, 5, 6, 8};
        int n = start.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (end[i] > end[j]) {
                    swap(end, i, j);
                    swap(start, i, j);
                }
            }
        }

        int count = 0;
        int lastEnd = end[0];

        for (int i = 0; i < n; i++) {
            if (start[i] >= lastEnd) {
                count++;
                lastEnd = end[i];
                                System.out.printf("Selected lesson starting at %d and ending at %d \n", start[i], end[i]);
                            }
                        }

                        System.out.println("Maximum number of lessons: " + count);
    }

    private static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}