public class SortByFirstChar {
    public static void main(String[] args) {
        String[] str = {"banana", "Apple", "cherry", "avocado"};

        sortByFirstLetter(str);
        printArray(str);
    }

    public static void sortByFirstLetter(String[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minIdx = i;

            for (int j = i + 1; j < array.length; j++) {
                if (compareFirstChar(array[j], array[minIdx]) < 0) {
                    minIdx = j;
                }
            }

            swap(array, i, minIdx);
        }
    }

    public static int compareFirstChar(String str1, String str2) {
        char char1 = Character.toLowerCase(str1.charAt(0));
        char char2 = Character.toLowerCase(str2.charAt(0));
        return Character.compare(char1, char2);
    }

    public static void swap(String[] array, int i, int j) {
        if (i == j) return;
        String temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void printArray(String[] array) {
        for (String s : array) {
            System.out.print(s + " ");
        }
        System.out.println();
    }
}
