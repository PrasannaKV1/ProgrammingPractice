package strings;

public class StringLengthWithoutStringFunctions {

    public static void main(String[] args) {
        //finding string length without using inbuild length() method
        String s="Prasanna";
        int length=0;
        char ch[]=s.toCharArray();
        for(int i=0;i< ch.length;i++)
        {
            length++;
        }
        System.out.println(length);
    }
}
