package Strings;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class validMail {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String input=sc.next();

        Pattern  p=Pattern.compile("[a-z]+[0-9]*@[a-z]+[.][a-z]+");
//        Pattern  p=Pattern.compile("[+]91-[6-9][0-9]{9}");

//        Pattern  p=Pattern.compile("");
        Matcher m= p.matcher(input);
//        System.out.println(m.find());
        if(m.matches()){
            System.out.println(m.group());
        }
        else {
            System.out.println("Invalid");
        }
        String s="abcde";
        String goale="cdeab";




        int id= s.indexOf('a');
        System.out.println(id);
    }
}
