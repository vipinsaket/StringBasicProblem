package Strings;

public class ReplaceAllVowal {
    public static void main(String[] args) {

        System.out.println("program start form here");
        String s="Jspiders";
        String match="aeiouAEIOU";
        int len=s.length();

        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(match.contains(c+"")){
                s=s.replace(c+"","");
            }
        }
        System.out.println(s);
    }
}
