class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<9;i++)
        {
            if(!checkRow(board[i]))
            {
                return false;
            }
        }

        for(int j=0;j<9;j++)
        {
            if(!checkCol(board,j))
            {
                return false;
            }
        }

        for(int boxnum=0;boxnum<9;boxnum++)
        {
            if(!checkBox(board,boxnum))
            {
                return false;
            }
        }

        return true;

    
    }

    public boolean checkRow(char[]row)
    {
        boolean [] found = new boolean[10];
        for(int i=0;i<9;i++)
        {
            char c = row[i];
            if(c=='.')
            {
                continue;
            }
            int digit = c-'0';
            if(found[digit])
            {
                return false;
            }
            found[digit] = true;
        }
        return true;
    }
    public boolean checkCol(char[][] board,int j)
    {
        boolean [] found = new boolean[10];
        for(int i=0;i<9;i++)
        {
            char c = board[i][j];
            if(c=='.')
            {
                continue;
            }
            int digit = c-'0';
            if(found[digit])
            {
                return false;
            }
            found[digit] = true;
        }
        return true;
    }
    public boolean checkBox(char[][] board,int boxnum)
    {
        
        int i = 3*(boxnum/3);
        int j=  3*(boxnum%3);
        boolean [] found = new boolean[10];
        for(int a=i;a<(i+3);a++)
        {
         for(int b=j;b<(j+3);b++)
            {


            char c = board[a][b];
            if(c=='.')
            {
                continue;
            }
            int digit = c-'0';
            if(found[digit])
            {
                return false;
            }
            found[digit] = true;
        }
        }
        return true;
    }
    
}