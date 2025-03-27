package Strings;

public class numberOfCapitalSmallNumberAndsp {
    public static void main(String[] args) {
        String s="Ahodsf$*#59TMDjg96&$";
        int capital=0;
        int small=0;
        int number=0;
        int specialCharacter=0;

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>='0'&& s.charAt(i)<='9')
                number++;
            else if (s.charAt(i)>='a'&& s.charAt(i)<='z')
                small++;
            else if (s.charAt(i)>='A'&& s.charAt(i)<='Z')
                capital++;
            else
                specialCharacter++;

        }
        System.out.println("Capital latter are :"+capital);
        System.out.println("Small latter is :"+small);
        System.out.println("Numbers are :"+ number);
        System.out.println("Special character are :"+specialCharacter);
        System.out.println("The Length of given string is:"+s.length());
    }
}
