package Strings;

public class CountLatterAfter {
    public static void main(String[] args) {
        String s="aaaaaabbcccaaddee";
        String res="";

        char [] CharArr=s.toCharArray();
        for(int i=0;i<CharArr.length;i++){
            int count=1;
            for(int j=i+1;j<CharArr.length;j++){
                if(CharArr[i]==CharArr[j])
                {
                    count++;
                    i=j;
                }
                else{
                    res+=CharArr[i]+""+count;
                    break;
                };
            }
            if(i==CharArr.length-1)
                res+=CharArr[i]+""+count;
        }
        System.out.println(res);

    }
}
