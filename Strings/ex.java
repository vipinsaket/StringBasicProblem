package Strings;

public class ex {
    public static void pr1(String str){
        String wd="";
        String sen="";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!=32){
                wd=str.charAt(i)+wd;
            }
            else {
                sen=sen+wd+" ";
                wd="";
            }

        }
        sen=sen+wd;
        System.out.println(sen);
    }
    public static void pr2(String s){
        String res="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i+1);
            int a=Integer.parseInt(ch+"");
            for(int j=1;j<=a;j++){
                res=res+s.charAt(i);
            }
            i++;
        }
        System.out.println(res);
    }
    public static void pr3(String str){
        String res="";
        char ch[]=str.toCharArray();
        for(int i=0;i<ch.length;i++){
            if(ch[i]=='\u0000')continue;
            for(int j=i+1;j<ch.length;j++){
                if(ch[i]==ch[j]){
                    ch[j]='\u0000';

                }
            }
            res=res+ch[i];

        }
        System.out.println(res);
    }

    public static void pr4(String s){
        String res="";
        char []ch=s.toCharArray();
        for(int i=0;i<ch.length;i++){
            if(ch[i]=='\u0000') continue;
            boolean b=true;
            for(int j=i+1;j<ch.length;j++){
                if(ch[i]==ch[j])
                {
                    ch[j]='\u0000';
                    b=false;
                }
            }
            if(b){
                res+=ch[i];
            }
        }
        System.out.println(res);
    }

    public  static void pr5(String s){
        char []ch=s.toCharArray();
        for(int i=0;i<ch.length-1;i++){
            if(ch[i]==ch[i+1]){
                ch[i+1]='$';
            }
        }
        System.out.println(ch);
    }

    public static void main(String[] args) {
        String str="boss";
        pr5(str);

    }
}
