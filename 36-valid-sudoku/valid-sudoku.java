class Solution {
    public boolean isValidSudoku(char[][] board) {
        int a=board.length;
        int b=board[0].length;
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<a;i++){
            for(int k=1;k<=9;k++){
                map.put(k,1);
            }
            for(int j=0;j<b;j++){
                if(board[i][j] == '.') continue;

                int x = board[i][j] - '0';
                if(map.get(x).equals(1)){
                    map.put(x,0);
                }else{
                    return false;
                }
            }
        }
        for(int j=0;j<a;j++){
            for(int k=1;k<=9;k++){
                map.put(k,1);
            }
            for(int i=0;i<b;i++){
                if(board[i][j] == '.') continue;

                int x = board[i][j] - '0';
                if(map.get(x).equals(1)){
                    map.put(x,0);
                }else{
                    return false;
                }
            }
        }
        for(int p=0;p<9;p+=3){
            for(int q=0;q<9;q+=3){
                for(int k=1;k<=9;k++){
                    map.put(k,1);
                }
                for(int i=p;i<p+3;i++){
                    for (int j=q;j<q+3;j++){
                        if(board[i][j]=='.') continue;
                        int x=board[i][j]-'0';
                        if(map.get(x).equals(1)){
                            map.put(x,0);
                        }else{
                            return false;
                        }
                    }
                }
                  
            }
        }

        return true;

    }
}
