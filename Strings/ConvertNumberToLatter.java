package Strings;

public class ConvertNumberToLatter {
    public static void main(String[] args) {
        String s="a2b3c0*3hello";
        String res="";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (i+1<s.length() && Character.isDigit(s.charAt(i + 1))) {
                int count = s.charAt(i + 1) - '0';
                for (int j = 0; j < count; j++) {
                    res += ch;
                }
                i++;
            }
            else {
                res+=ch;
            }

        }




        System.out.println(res);


    }
}
