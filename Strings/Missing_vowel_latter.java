package Strings;

import java.util.Scanner;

public class Missing_vowel_latter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a word ");
        String s=sc.nextLine();
        String res="aeiouAEIOU";

//       for(char ch:s.toCharArray()) {
//          if(res.contains(String.valueOf(ch))){
//              res=res.replace(ch+"","");
//          }
//       }
      for(int i=0;i<s.length();i++) {
          char ch=s.charAt(i);
          if(res.contains(ch+"")){
              res=res.replace(ch+"","");
          }
       }
        System.out.println(res);
    }
}
