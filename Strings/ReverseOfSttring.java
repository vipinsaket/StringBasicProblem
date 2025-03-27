package Strings;

public class ReverseOfSttring {
    public static String rev(String s){
        String wd="";
        String sen="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);

            if(ch!=32){
                wd=wd+ch;
            }
            else {
                sen=wd+" "+sen;
                wd="";
            }
        }
        sen=wd+" "+sen;
        return sen.trim();
    }
    public static void main(String[] args) {
        String s="java is very easy";
        System.out.println(rev(s));
    }
}
