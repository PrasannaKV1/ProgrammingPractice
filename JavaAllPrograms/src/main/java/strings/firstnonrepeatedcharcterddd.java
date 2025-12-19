package strings;

public class firstnonrepeatedcharcterddd {
    public static void main(String[] args) {

        String s="prasannaniveditha";
        for(int i=0;i<s.length();i++)
        {
            boolean unique=true;
            for(int j=i+1;i<s.length();j++)
            {
                if((s.charAt(i)==s.charAt(j)))
                {
                    unique=false;
                    break;
                }
            }
            if(unique)
            {
                System.out.println(s.charAt(i));
                break;
            }
        }
    }
}
