package Strings;

import java.util.Scanner;

public class Zigzag_Conversion {

    public static String conversion(String s,int n){
        String [] ns=new String[n];
        for(int i=0;i<ns.length;i++){
            ns[i]="";

        }
        int i=0;
        while (i<s.length()){
            for (int index=0;index<n &&  i<s.length();index++){
                ns[index]+=s.charAt(i++);
            }
            for(int index=n-2;index>0 && i<s.length();index--){
                ns[index]+=s.charAt(i++);
            }
        }
        String res="";
        for(String str:ns){
            res+=str;
        }

        return res;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int n=sc.nextInt();

        String str=conversion(s,n);
        System.out.println(str);
    }
}
