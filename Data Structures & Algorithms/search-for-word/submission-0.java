class Solution {
    int[][] dir = {{-1, 0}, {0, -1}, {1, 0}, {0, 1}};
    public boolean com(int i, int j, int index, String target, char[][] arr) {
        if (i < 0 || i >= arr.length || j < 0 || j >= arr[0].length) {
            return false;
        }
        if (arr[i][j] != target.charAt(index)) {
            return false;
        }
        if (index == target.length() - 1) {
            return true;
        }
        char temp = arr[i][j];
        arr[i][j] = '*';
        for (int[] directions : dir) {
            int r = i + directions[0];
            int c = j + directions[1];
            if (com(r, c, index + 1, target, arr)) {
                return true;
            }
        }
        arr[i][j] = temp;
        return false;
    }
    public boolean exist(char[][] board, String word) {
        int n = board.length;
        int m = board[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (com(i, j, 0, word, board)) {
                    return true;
                }
            }
        }
        return false;
    }
}
