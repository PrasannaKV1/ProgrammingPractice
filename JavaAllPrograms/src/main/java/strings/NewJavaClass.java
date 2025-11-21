package strings;

public class NewJavaClass {
    public static void main(String[] args) {
        String s ="prasanna is awasome";
        String words[]=s.trim().split("\\s+");

        //iavaga for-each loop use madtini
        for(String sh:words)
        {
            System.out.println(sh);
        }



    }
}
