package Strings;

public class Print1by1Latter {
    public static void main(String[] args) {
        String s="Vipin";
            for(int j=1;j<s.length()+1;j++) {
                System.out.println(s.substring(0, j));
            }
    }
}
