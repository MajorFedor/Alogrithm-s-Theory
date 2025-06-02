public class SecondTask {
    public static final int N = 5;

    public static void solve() {
        int[] board = new int[N];
        rookPlace(board, 0);
    }

    public static void rookPlace(int[] board, int row) {
        if (row == N) {
            printBoard(board);
            return;
        }

        for (int col = 0; col < N; col++) {
            if (isSafe(board, row, col)) {
                board[row] = col;
                rookPlace(board, row + 1);
            }
        }
    }

    public static boolean isSafe(int[] board, int row, int col) {
        for (int i = 0; i < row; i++) {
            if (board[i] == col) {
                return false;
            }
        }
        return true;
    }
    public static void printBoard(int[] board) {
        for (int row = 0; row < N; row++) {
            for (int col = 0; col < N; col++) {
                System.out.print(board[row] == col ? "R\t" : ".\t");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String[] args) {
        solve();
    }
}
