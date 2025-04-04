package Strings;

public class Consonent_GT3 {

    public static void st(int n){
        System.out.println(n);
    }
    public static void main(String[] args) {
        String s="Amaran";
        String str="aeiouAEIOU";
        int count =0;
       for(int i=0;i<s.length();i++){
           char ch=s.charAt(i);
           if(!str.contains(ch+"")){
               count++;
           }
       }
       char []ch=s.toCharArray();
       if(count>=3){
           for(int i=0;i<ch.length;i++){
               char c=ch[i];
               if(!str.contains(c+"")){
                   ch[i]='_';
               }
           }
       }
        System.out.println(ch);
    }
}
