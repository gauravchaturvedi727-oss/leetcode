import java.util.HashSet;

class Solution {
    public boolean isValidSudoku(char[][] board) {

        HashSet<Character>[] rows = new HashSet[9];
        HashSet<Character>[] cols = new HashSet[9];
        HashSet<Character>[] boxes = new HashSet[9];

        for (int i = 0; i < 9; i++) {
            rows[i] = new HashSet<>();
            cols[i] = new HashSet<>();
            boxes[i] = new HashSet<>();
        }

        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {

                char ch = board[row][col];

                if (ch == '.') {
                    continue;
                }

                int box = (row / 3) * 3 + (col / 3);

                if (rows[row].contains(ch) ||
                    cols[col].contains(ch) ||
                    boxes[box].contains(ch)) {
                    return false;
                }

                rows[row].add(ch);
                cols[col].add(ch);
                boxes[box].add(ch);
            }
        }

        return true;
    }
}