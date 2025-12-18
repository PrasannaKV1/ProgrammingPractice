package arrays;

public class Findduplicatestring {

    public static void main(String[] args) {
        String s="prasanna";
        // duplicatecharacters count madbeku kandaaa


        for (int i = 0; i <s.length() ; i++) {
            {
                for (int j = i+1; j <s.length() ; j++)
                {
                    if(s.charAt(i)==s.charAt(j))
                    {
                        System.out.println(s.charAt(i));
                        break;
                    }
                }
            }

        }

    }
}
