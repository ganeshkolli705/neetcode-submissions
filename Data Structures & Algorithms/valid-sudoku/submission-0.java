class Solution {
    public boolean isValidSudoku(char[][] board) {
        int t =1;
        for(int i =0;i<9;i++){
            for(int j =0;j<9;j++){
                char num = board[i][j];
                if(num == '.'){
                    continue;
                }
                for(int k =0;k<9;k++){
                    if(k!=j && board[i][k]==num){
                        t=0;
                    }
                }
                for(int h =0;h<9;h++){
                    if(h!=i && board[h][j]==num){
                        t=0;
                    }
                }
                int row = (i/3)*3;
                int col = (j/3)*3;
                for(int r =row;r<row+3;r++){
                    for(int c =col;c<col+3;c++){
                        if((c!=j || r!=i) && board[r][c]==num){
                            t=0;
                        }
                    }
                }
            }
        }
        return t==1;
    }
}
