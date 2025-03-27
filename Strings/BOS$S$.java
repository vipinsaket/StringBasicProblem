package Strings;

import java.util.Scanner;

public class BOS$S$ {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string ");
        String s=sc.nextLine();
        char [] ch=s.toCharArray();
        for(int i=0;i<s.length()-1;i++){

            if(ch[i]==ch[i+1]){
                ch[i+1]='$';
            }

        }
        System.out.println(ch);
    }
}
