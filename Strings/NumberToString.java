package Strings;

import java.util.Scanner;

public class NumberToString {
    public static String convert(int n , String s){

        String res="";
        String [] one={"","One","Two" ,"Three", "Four" ,"Five","Six","Seven","Eight","Nine","Ten","Eleven","Twelve",
                "Thirteen","Fourteen","Fifteen" ,"Sixteen","Seventeen","Eighteen","Nineteen"};
        String [] two={"","","Twenty","Thirty","Forty","Fifty","Sixty","Seventy","Eight","Ninety"};
        if(n<=19){
            System.out.print(one[n]+" ");
            res+=one[n]+" ";
        }
        else {
            System.out.print(two[n/10]+" "+one[n%10]+" ");
            res+=two[n/10]+" "+one[n%10]+" ";
        }
        if(n!=0){
            System.out.print(s+" ");
            res+=s+" ";
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int num=sc.nextInt();
        String str="";

        convert(num/1000000000," Billion");
        convert((num/ 1000000)%100, " Million");
        convert((num/1000)%100," Thousand");
        convert((num/100)%10," Hundred");
        convert(num%100,"");


    }
}













/*


class Solution {
    public static String convert(int n, String s) {
        String res = "";
        String[] one = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten",
                        "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
        String[] two = {"", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};

        if (n > 0) {
            if (n >= 100) {
                res += one[n / 100] + " Hundred ";
                n %= 100;
            }
            if (n < 20) {
                res += one[n] + " ";
            } else {
                res += two[n / 10] + " " + one[n % 10] + " ";
            }
            if (!s.isEmpty()) {
                res += s + " ";
            }
        }
        return res;
    }
    public String numberToWords(int num) {
         String str = "";
         if(num==0) return "Zero";
        str += convert(num / 1000000000, "Billion");
        str += convert((num / 1000000) % 1000, "Million");
        str += convert((num / 1000) % 1000, "Thousand");
        str += convert((num / 100) % 10, "Hundred");
         if (num % 100 > 0) {
            str +=  convert(num % 100, "");
        }


        return str.trim();



    }
}


 */