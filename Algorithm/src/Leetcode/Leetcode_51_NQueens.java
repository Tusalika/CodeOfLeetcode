package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class Leetcode_51_NQueens {

    public static void main(String[] args) {
        Leetcode_51_NQueens s= new Leetcode_51_NQueens();
        s.solveNQueens(8);
        for (int i = 0; i < s.res.size(); i++) {
            System.out.println(s.res.get(i));
        }
    }

    private int n;
    private List<List<String>> res;
    private List<String> board;

    public List<List<String>> solveNQueens(int n) {
        this.n = n;
        res = new ArrayList<>();
        board = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; ++i) sb.append('.');
        for (int i = 0; i < n; ++i) board.add(sb.toString());
        backtrack(0);
        return res;
    }

    private void backtrack(int row) {
        if (row == n) {
            res.add(new ArrayList<>(board));
            return;
        }
        for (int col = 0; col < n; ++col) {
            if (!isValid(row, col)) continue;
            setChar(row, col, 'Q');
            backtrack(row + 1);
            setChar(row, col, '.');
        }
    }

    private boolean isValid(int row, int col) {
        for (int i = 0; i < row; ++i) {
            if (board.get(i).charAt(col)=='Q')
                return false;
        }
        for (int i=row-1,j=col-1;i>=0&&j>=0;--i,--j) {
            if (board.get(i).charAt(j)=='Q')
                return false;
        }
        for (int i=row-1,j=col+1;i>=0&&j<n;--i,++j) {
            if (board.get(i).charAt(j)=='Q')
                return false;
        }
        return true;
    }

    private void setChar(int row, int col, char c) {
        StringBuilder sb = new StringBuilder(board.get(row));
        sb.setCharAt(col, c);
        board.set(row, sb.toString());
    }

}
