package strings;

public class InterviewProgram {

    public static void main(String[] args) {
        String s="kapil dev";
        String words[]=s.split(" ");
        StringBuilder result=new StringBuilder();
        for(int i=0;i< words.length;i++)
        {
            StringBuilder sb=new StringBuilder(words[i]);
            result.append(sb.reverse());
            if(i< words.length)
            {
                result.append(" ");
            }
        }

        System.out.println(result);
    }
}
