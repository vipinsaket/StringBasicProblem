package Strings;

import java.util.Scanner;

public class Palindorm_word_in_string {
    public static boolean isP(String s){
        int st=0;
        int end=s.length()-1;
        while(st<end){
            if(s.charAt(st)!=s.charAt(end)) return false;
            st++;
            end--;
        }
        return true;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a line ");
        String s=sc.nextLine();
        String []str=s.split(" ");

        for(int i=0;i<str.length;i++){

            if(isP(str[i])){
                System.out.println(str[i]);
            }
        }

    }
}
