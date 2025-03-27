package Strings;

import java.util.Scanner;

public class removeExtraSpaces {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        String s="    javaa   is    easy           ";
        String result="";
        s=s.trim();
        System.out.println(s.length());
        System.out.println(s);
        for(int i=0;i<s.length();i++) {

            if (s.charAt(i) == 32 && s.charAt(i + 1) != 32) {
                result += s.charAt(i);
            }
            else if (s.charAt(i) != 32)
                result += s.charAt(i);

        }
        System.out.println(result);
    }
}
