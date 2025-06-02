public class FirstTask {
    public static final int N = 5;
    
    public static void solve() {
        int[] board = new int[N];
        bishopPlace(board, 0);
    }

    public static void bishopPlace(int[] board, int row) {
        if (row == N) {
            printBoard(board);
            return;
        }

        for (int col = 0; col < N; col++) {
            if (isSafe(board, row, col)) {
                board[row] = col;
                bishopPlace(board, row + 1);
            }
        }
    }

    public static boolean isSafe(int[] board, int row, int col) {
        for (int i = 0; i < row; i++) {
            if (Math.abs(board[i] - col) == Math.abs(i - row)) {
                return false;
            }
        }
        return true;
    }

    public static void printBoard(int[] board) {
        for (int row = 0; row < N; row++) {
            for (int col = 0; col < N; col++) {
                System.out.print(board[row] == col ? "B\t" : ".\t");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        solve();
    }
}
