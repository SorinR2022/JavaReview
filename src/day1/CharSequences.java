package day1;

public class CharSequences {

    public static void main(String[] args) {


        String str1 = "Java";
        String str2 = new String ("Java");

        System.out.println(str1 == str2);
        System.out.println(str1.equals((str2)));

        //StringBuilder stringBuilder = "Java"; have to be used with new word

        StringBuilder stringBuilder = new StringBuilder("Java");

        //StringBuffer stringBuffer = "Java"; have to be used with new word

        StringBuffer stringBuffer = new StringBuffer("Java");

        String s1 = "Sorin"; // is IMMUTABLE

        s1.concat("School");

        System.out.println(s1);

        StringBuilder s2 = new StringBuilder("Sorin");
        s2.append(" review");

        System.out.println(s2);

        StringBuffer s3 = new StringBuffer("Sorin");
        s3.append(" review");
        
        System.out.println(s3);


    }
}
