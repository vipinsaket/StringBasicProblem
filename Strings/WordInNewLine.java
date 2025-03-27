package Strings;

public class WordInNewLine {
    public static void main(String[] args) {
        String s="Java is very easy";
        s=s.trim();
        String res="";

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==32){
                System.out.println(res);
                res="";
            }
            else {
                res+=s.charAt(i);
            }
        }
        System.out.println(res);
    }
}
