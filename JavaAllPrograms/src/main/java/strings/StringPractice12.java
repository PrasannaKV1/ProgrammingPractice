package strings;

public class StringPractice12 {

    public static void main(String[] args) {
        //this is the program to check number words in a String

        String s1="Hi Good Morning how are you";
        String[] words=s1.trim().split("\\s+");
        System.out.println("The number of words are "+words.length);
    }
}
