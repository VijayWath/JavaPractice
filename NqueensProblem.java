import java.util.*;

public class NqueensProblem {
    public static boolean isSafe(int row, int column, char[][] board) {
        // horizontal
        for (int j = 0; j < board.length; j++) {
            if (board[row][j] == 'Q') {
                return false;
            }
        }
        // verical
        for (int k = 0; k < board.length; k++) {
            if (board[k][column] == 'Q') {
                return false;
            }
        }
        // uppur left
        int r = row;
        for (int c = column; c >= 0 && r >= 0; c--, r--) {
            if (board[r][c] == 'Q') {
                return false;
            }
        }
        // upper right
        r = row;

        for (int c = column; c < board.length && r >= 0; c++, r--) {
            if (board[r][c] == 'Q') {
                return false;
            }
        }

        // lower left
        r = row;
        for (int c = column; c > 0 && r <= board.length; c--, r++) {
            if (board[r][c] == 'Q') {
                return false;
            }
        }
        // lowre rigth
        r = row;
        for (int c = column; c <= board.length && r <= board.length; c++, r++) {
            if (board[r][c] == 'Q') {
                return false;
            }
        }
        return true;

    }

    public static void saveBoard(char[][] board, List<List<String>> allBoards) {
        String row = "";
        List<String> newboard = new ArrayList<>();
        for (int i = 0; i < board.length; i++) {
            row = "";
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == 'Q') {
                    row += 'Q';
                } else {
                    row += '.';
                }
            }
            newboard.add(row);
        }
        allBoards.add(newboard);
    }

    public static void helper(char[][] board, List<List<String>> allBoards, int column) {
        if (column == board.length) {
            saveBoard(board, allBoards);
            return;
        }
        for (int row = 0; row < board.length; row++) {
            if (isSafe(row, column, board)) {
                board[row][column] = 'Q';
                helper(board, allBoards, column + 1);
                board[row][column] = '.';
            }
        }
    }

    public static List<List<String>> solveQueens(int n) {
        List<List<String>> allBoards = new ArrayList<>();
        char[][] board = new char[n][n];
        helper(board, allBoards, n);
        return allBoards;
    }

    public static void main(String[] args) {
        List<List<String>> abc = solveQueens(4);
        
    }
}
