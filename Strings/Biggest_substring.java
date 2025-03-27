package Strings;

import java.util.ArrayList;

public class Biggest_substring {
    public static boolean isP(String s){
        int st=0;
        int end=s.length()-1;
        while (st<end){
            if(s.charAt(st)!=s.charAt(end))
                return false;
            st++;
            end--;

        }
        return true;
    }
    public static void main(String[] args) {
        String s="aaa";
        int MaxLen=0;
        String maxString="";


        for(int i=0;i<s.length()-1;i++){
            for(int j=i+1;j<s.length()+1;j++){
                String str=s.substring(i,j);

                if (isP(str) &&  MaxLen < str.length()) {
                        maxString=str;

                        MaxLen=str.length();
                }
            }
        }
        System.out.println(maxString);

    }
}
