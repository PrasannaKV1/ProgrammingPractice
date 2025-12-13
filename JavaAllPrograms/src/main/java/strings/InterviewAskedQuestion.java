package strings;

public class InterviewAskedQuestion {
    public static void main(String[] args) {
        String s="202020";
        StringBuilder zeros=new StringBuilder();
        StringBuilder nonzeros=new StringBuilder();

        // Nan ivaga adun character array agi convert madtini
        for(char ch:s.toCharArray())
        {
            if(ch=='0')
            {
                zeros.append(ch);
            }
            else
            {
                nonzeros.append(ch);
            }
        }

        String result=zeros.toString()+nonzeros.toString();
        System.out.println(result);


        // Never Give Up


    }
}
