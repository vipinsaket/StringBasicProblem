package Strings;

public class StringToInteger {
    public static void main(String[] args) {
        String s="4646";
        int sum=0;
        for(int i=0;i<s.length();i++){
            sum=(sum*10)+(s.charAt(i)-'0');
        }
        System.out.println("The value of integer is :"+sum);

        String str="abcd";
        System.out.println(str.substring(str.length()));
    }
}
