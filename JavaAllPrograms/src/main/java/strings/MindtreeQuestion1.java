package strings;

public class MindtreeQuestion1 {
    public static void main(String[] args) {
        String s = "ABCDE";
        String rev = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            rev += s.charAt(i);

        }
        // firstoutput
        System.out.println(rev);

        //second output

        char ch1[] = rev.toCharArray();
        for (int k = 0; k < ch1.length; k++) {
            System.out.println(ch1[k] + "" + (k+1));
        }

        //third output
        char ch2[]=s.toCharArray();

        for (int m = 0; m < ch2.length; m++) {
            System.out.println(ch1[m]+""+(m+1)+""+ch2[m]);

        }


    }
}



