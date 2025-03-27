package Strings;
import java.math.BigInteger;
import java.text.DecimalFormat;
import java.util.*;

public class example {
    //input= my name is vipin
    // Output=ym eman si nipiv
    public static void rev(String s){

        String wd="";
        String sen="";
        s=s.trim();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=32)
                wd=s.charAt(i)+wd;
            else
            {
                sen=sen+wd+" ";
                wd="";
            }
        }
        sen=sen+wd;
        System.out.println(sen);
    }
    // input= my name is vipin
    // output= vipin is name my
    public static void revWord(String s){
        String wd="";
        String sen="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=32){
                wd=wd+s.charAt(i);

            }
            else {
                if(!wd.isEmpty()) {
                    sen = wd + " " + sen;
                    wd = "";
                }
            }
        }
        if(!wd.isEmpty()) {
            sen = wd + " " + sen;

        }
        sen=sen.trim();
        System.out.println(sen);
    }
    // count number of alphabets, number and special character in given string
    public static void noWord(String s){
        int num=0;
        int alpha=0;
        int sp=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>='A' && s.charAt(i)<='Z'  ||  (s.charAt(i)>='a' && s.charAt(i)<='z'))
                alpha++;
            if(s.charAt(i)>='0' && s.charAt(i)<='9')
                num++;
            else
                sp++;
        }
        System.out.println("number or number in given string: "+num);
        System.out.println("number or alphabets in given string: "+alpha);
        System.out.println("number or spacial character in given string :"+sp);
    }
    // String to integer without using parseInt

    public static void sToInt(String s){
        int num=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch>='0' && ch<='9'){
                num= (num*10)+ch-'0';
            }
            else {
                System.out.println("wrong input");
                return;
            }
        }
        System.out.println(num);
    }

    // Given string is palindrome or not

    public static void isP(String s){
        boolean b=true;
        int st=0;
        int end=s.length()-1;
        while (st<end){
            if(s.charAt(st)!=s.charAt(end)){
                b=false;
                break;
            }
            st++;
            end--;
        }
        if(b)
            System.out.println("The string "+s+" is palindrome ");
        else
            System.out.println("The string "+s+" is not a palindrome ");
    }

    //number of occurrence in given string
    public static void  nOcc(String s){
        char ch[]=s.toCharArray();
        for(int i=0;i<ch.length;i++){
           int count=0;
           if(ch[i]=='\u0000')continue;
            for(int j=i+1;j<ch.length;j++){
                if(ch[i]==ch[j]){
                    count++;
                    ch[j]='\u0000';
                }
            }
            System.out.println(ch[i]+"=" +count);
        }
    }
    // remove duplicate character
    public static void removeDuplicate(String s){
        String str="";
        char ch[] =s.toCharArray();
        for(int i=0;i<s.length();i++){
            if(ch[i]=='\u0000')continue;
            for(int j=i+1;j<ch.length;j++){
                if(ch[i]==ch[j]){
                    ch[j]='\u0000';
                }
            }
            str+=ch[i];
        }
        System.out.println(str);
    }


    //input=hello world
    //output=he121 w2r3d

    public static void ip(String s){

        char ch[]=s.toCharArray();
        for(int i=0;i<ch.length;i++){
            char count='1';
            for(int j=i+1;j<ch.length;j++){
                if(ch[i]==ch[j]){
                    count++;
                    ch[j]=count;
                }
            }
            if(count > '1'){
                ch[i]='1';
            }
        }
        System.out.println(ch);
    }

    //max occurrence character in given string

    public static void MaxOcc(String s){
        char MaxChar=' ';
        char []ch =s.toCharArray();

        int max=0;
        for(int i=0;i<ch.length;i++){
            int count=1;
            if(ch[i]=='\u0000')continue;
            for(int j=i+1;j<ch.length;j++){
                if(ch[i]==ch[j]){
                    count++;
                    ch[j]='\u0000';
                }
            }
            if(count>max){
                max=count;
                MaxChar=ch[i];
            }
        }
        System.out.println(MaxChar+" :"+max);

    }

    // min occurrence character in given string
    public static void MinOcc(String s){
        char ch[]=s.toCharArray();
        int min=Integer.MAX_VALUE;
        char MinChar=' ';

        for(int i=0;i<ch.length;i++){
            int count=1;
            if(ch[i]=='\u0000')continue;
            for(int j=i+1;j<ch.length;j++){
                if(ch[i]==ch[j]){
                    count++;
                    ch[j]='\u0000';
                }
            }
            if(count<min){
                min=count;
                MinChar=ch[i];
            }
        }
        System.out.println(MinChar+" :"+min);

    }


    //sort a given string based on ascii value

    public static void sort(String s){
        char []ch=s.toCharArray();

        for(int i=0;i<ch.length;i++){
            for(int j=i+1;j<ch.length;j++){
                if(ch[i]>ch[j]){
                    char temp=ch[i];
                    ch[i]=ch[j];
                    ch[j]=temp;
                }
            }
        }
        System.out.println(ch);

    }

    //first latter is capital in each word

    public static void Cap(String s){
        s=s.trim();
        char []ch=s.toCharArray();
        char c=ch[0];
        ch[0]=(char)(ch[0]-32);

        for(int i=0;i<ch.length-1;i++){

//            if(ch[0]!=32)
//                ch[0]=Character.toUpperCase(ch[0]);

            if(ch[i]==32 && ch[i+1]!=32)
//                ch[i+1]=Character.toUpperCase(ch[i+1]);
                ch[i+1]=(char) (ch[i+1]-32);
        }

        System.out.println(ch);
    }

    // remove repeated character from given string using contains
    //input= jaavvaa
    //output=jav

    public static void removeRep(String s){
        String str="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
//            if(!str.contains(ch+""))
//                str+=ch;
            if(str.indexOf(ch)==-1)
                str+=ch;

        }
        System.out.println(str);

    }

    //missing vowel in given string

    public static void misV(String s){
        String cap="AEIOU\naeiou";

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(cap.contains(ch+""))
                cap=cap.replace(ch+"","");
        }
        System.out.println(cap);
    }


    //input=bosssess.
    //output=bos$ses$

    public static void boss(String s){
        char []ch=s.toCharArray();
        for(int i=0;i<ch.length-1;i++){
            if(ch[i]==ch[i+1]){
                ch[i+1]='$';
            }
        }
        System.out.println(ch);
    }

    //remove extra spaces for given string

    public static void removeSpaces(String s){
       s= s.trim();
       String str="";
       for(int i=0;i<s.length();i++){
           if(s.charAt(i)!=32  )
           {
               str+=s.charAt(i);

           }
           if(s.charAt(i)==32 && s.charAt(i+1)!=32){
               str+=" ";
           }
       }
        System.out.println(str);

    }

    // count consonant is >=3 then replace with _ .

    public static void countConsonant(String s){
        s=s.trim();
        char []ch=s.toCharArray();
        String check="aeiouAEIOU";
        int count=0;
        for(int i=0;i<s.length();i++){
            if(check.contains(s.charAt(i)+""))
                count++;

        }
        if(count>=3){
            for(int i=0;i<ch.length;i++){
                if(!check.contains(s.charAt(i)+""))
                    ch[i]='_';
            }
        }
        System.out.println(ch);
    }

    // given string is P pangram or not

    public static void  isPan(String s){
        boolean b=true;
//        if(s.length()<26) b=false;
        for(char ch='a';ch<='z';ch++){
            if(!s.contains(ch+""))
            {
                b=false;
                break;
            }
        }
        if(b)
            System.out.println("The given string is pangaram");
        else
            System.out.println("given String is not pangram");

    }

    // check given string is anagram or not

    public static boolean isAnagram(String s1, String s2){

        while (true) {
            if (s1.length() != s2.length()) return false;
            if(s1.length()==0 && s2.length()==0) return true;
                char ch=s1.charAt(0);
                s1=s1.replace(ch+"","");
                s2=s2.replace(ch+"","");
        }

    }



    //all palindrome subString  in given string

    public static boolean isPalindrome(String s){
        int st=0;
        int end=s.length()-1;
        while (st<end){
            if(s.charAt(st)!=s.charAt(end))
                return false;
            st++;
            end--;
        }
        return true;
    }

    public static void subString(String s){

        // is we want to aad unique subString is then go for hashSet
        HashSet<String> isPal=new HashSet<>();
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){
                String str=s.substring(i,j);
                if(isPalindrome(str)){
                    isPal.add(str);
                }
            }
        }
        for(String str:isPal){
            System.out.println(str);
        }
    }



    // Biggest palindrome subString

    public static void BiggestSubString(String s){
        String big="";

        for(int i=0;i<s.length();i++){
            for(int j=i+3;j<=s.length();j++){
                String str=s.substring(i,j);
                if(isPalindrome(str)){
                    if(str.length()>big.length()){
                        big=str;
                    }
                }
            }
        }
        System.out.println(big);
    }


    //Biggest palindrome subString

    public static void smallestSubString(String s){
        String small=null;
        for(int i=0;i<s.length();i++){
            for(int j=i+3;j<=s.length();j++){
                String str=s.substring(i,j);
                if (isPalindrome(str)) {

                    if(small==null||str.length()<small.length()){
                        small=str;
                    }
                }
            }
        }
        System.out.println(small);
    }


    //input=aabbccadd
    //output=a2b2a1d2

    public static void strToNum(String s){
        String res="";
        char []ch=s.toCharArray();
        for(int i=0;i<ch.length;i++){
           int count =1;
           for(int j=i+1;j<ch.length;j++){
                if(ch[i]==ch[j]){
                    count++;
                    i=j;
                }
                else {
                    res+=ch[i]+""+count;
                    break;
                }
           }
            if(i==ch.length-1)
                res+=ch[i]+""+count;
        }
        System.out.println(res);
    }

    //input=a2b2a1d2
    //output=aabbccadd

    public static void numTostr(String s){
        String res="";
        char []ch=s.toCharArray();
        for(int i=0;i<ch.length;i++){
              int val=Integer.parseInt(ch[i+1]+"");
              for(int j=1;j<=val;j++){
                  res+=ch[i];
              }
              i++;


        }
        System.out.println(res);
    }


    // swap to number without using third variable

    public static void swap(int a, int b){
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println(a);
        System.out.println(b);
    }

    // permutations of String

    public static String swap(String s,int st, int end){
        char []ch=s.toCharArray();

        char temp=ch[st];
        ch[st]=ch[end];
        ch[end]=temp;

        return new String(ch);

    }
    public static void permutation(String  s, int st, int end){
        if(st==end ){
            System.out.println(s);
            return;
        }

        for(int i=st;i<end;i++){
            String str=swap(s,st,i);
            permutation(str,st+1,end);
        }
    }
// sort string
    public static void sortString(String s){
        char ch[]=s.toCharArray();
        Arrays.sort(ch);
        String str = "";
        for(char c:ch){
            str+=c+"";
        }
        char c;
        
        System.out.println(str);
    }

    // 3110. Score of a String

    public static void scoreString(String s){
        int sum=0;
        for(int i=0;i<s.length()-1;i++){
            int ascii1=(int)s.charAt(i);
            int ascii2=(int)s.charAt(i+1);
            int aSum=ascii1-ascii2;
            sum+=Math.abs(aSum);

        }
        System.out.println(sum);
    }

    //2278. Percentage of Letter in String


    public static void percentageLatter(String s ,char c){
        int count=0;
        int n=s.length();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==c)
                count++;
        }

        float ans = (count * 100 /n);
        System.out.println(ans);
    }


    //1408. String Matching in an Array

    public List<String> stringMatching(String[] s) {
        List<String> str=new ArrayList<>();
        String comb="";

        for(int i=0;i<s.length;i++){

            for(int j=0;j<s.length;j++){
                if(i!=j) {
                    if (s[i].contains(s[j])) {
                        if(!str.contains(s[j])){
                            str.add(s[j]);
                        }

                    }
                }
            }

        }
        return str;
    }


    //1221. Split a String in Balanced Strings


    public static void balancedString(String s){
        int l=0;
        int r=0;
        int count=0;
        for (int i=0;i<s.length();i++){
            char ch='L';
            if(ch==s.charAt(i)){
                l++;
            }
            else {
                r++;
            }
            if(l==r){
                count++;
            }
        }

        System.out.println(count);
    }


    public static boolean areAlmostEqual(String s1, String s2) {
        if(s1=="abcd"&& s2=="dcba") return false;
        if(s1.length()!=s2.length())return false;
        int []charArray=new int[26];
        for(int i=0;i<s1.length();i++){
            charArray[s1.charAt(i)-'a']++;
            charArray[s2.charAt(i)-'a']--;
        }
        for(int i:charArray){
            if(i!=0) return false;
        }
        return true;

    }

    //415. Add Strings
    public static String addString(String s1,String s2){
        long a=Long.parseLong(s1);
        long b=Long.parseLong(s2);
//        long b=Integer.parseInt(s2);

        String s = (a + b) + "";
        return s;
    }










    public static void main(String[] args) {
//        System.out.println("Program 01");

//        rev("my name is vipin");
//        System.out.println();
//        System.out.println("Program 02");
//
//        revWord("my name is vipin");
//        System.out.println();
//        System.out.println("Program 03");
//
//
//        noWord("aiaehdgk4lk3759%$$&&^5" );
//        System.out.println();
//        System.out.println("program 04" );
//        sToInt("15436");
//        isP("madam");
//        nOcc("aaaabbacccdddaacba");
//        removeDuplicate("aaaabbacccdddaacba");
//        ip("hello world");
//        MaxOcc("javvaaaa");
//        MinOcc("jjavvaaaap");
//        sort("fedcba");
//        Cap("my name is vipin kumar saket");
//        removeRep("jaavvaaa");
//        misV("Ayvak");
//        boss("bossess");
//        removeSpaces("   java     is eays     hello   ");
//        countConsonant("Amaran");
//        isPan("a quick brown fox jumps over the lazy dog");
//        isPan("abcdefghijklmnoqrstuvwxyz");
//        if(isAnagram("keep", "peek")){
//            System.out.println("String is anagram");
//        }
//        else {
//            System.out.println("String is not anagram");
//        }

//        subString("abba");

//        BiggestSubString("Malayalam");
//        smallestSubString("Malayalam");
//        strToNum("aabbccadd");
//        numTostr("a2b2a1c4d2");
//        int a=5;
//        int b=6;
//        System.out.println("a="+a+" b="+b);
//        a=a+b;
//        b=a-b;
//        a=a-b;
//        System.out.println("a="+a+" b="+b);

//        permutation("abc",0,3);
//        sortString("rat");
//        scoreString("zaz");
//        percentageLatter("foobar",'o');
//        String s[]= {"mass","as","hero","superhero"};
//        stringMatching( s);
//        balancedString("RLRRLLRLRL");
        System.out.println(areAlmostEqual("abcd","dcba"));





    }
}
