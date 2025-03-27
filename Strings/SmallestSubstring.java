package Strings;

public class SmallestSubstring {
    public static boolean isSubString(String s){
        int st=0;
        int end=s.length()-1;
        while(st<end){
            if(s.charAt(st)!=s.charAt(end))
                return false;
            st++;
            end--;

        }
        return  true;

    }
    public static void main(String[] args) {
        String str="malayalam";
        int min=Integer.MAX_VALUE;
        String res="";
        for(int i=0;i<str.length();i++){
            for(int j=i+2;j<str.length();j++)
            {
                String sub=str.substring(i,j);
                if(isSubString(str.substring(i,j)) && sub.length()<=min)
                {
                    res=str.substring(i,j);
                    min=str.substring(i,j).length();


                }
            }
        }
        System.out.println(res);
    }
}
