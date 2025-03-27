package Strings;

public class leetcode79 {

        public boolean exist(char[][] board, String word) {
            String s="";
            int count=0;
            int len=board.length;
            int idx=board[0].length;
            int k=0;
            while(k>=len*idx){
                for(char ch=0;ch<board.length;ch++){
                    for(char nh=0;nh<board[ch].length;nh++){
                        if(board[ch][nh]=='\u0000')continue;
                        if(board[ch][nh]==word.charAt(count++)){
                            s+=board[ch][nh];
                            board[ch][nh]='\u0000';
                        }
                    }
                }
                k++;
            }
            return word.equals(s);
        }
    }

