package Strings;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex01 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a mail");
        String s=sc.next();

        Pattern p=Pattern.compile("[a-z]+[0-9]*@gmail.com");

        Matcher m=p.matcher(s);
//        Vipinkumar11135@gmail.com

        while (m.find()){
            System.out.println(m.group());
        }




    }
}
