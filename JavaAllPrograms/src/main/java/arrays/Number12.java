    package arrays;

    import java.util.Scanner;

    public class Number12 {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int array[]={1,3,1,3,2,3,6,7};

            int frequency[]=new int[256];

            for(int a:array)
            {
                frequency[a]++;
            }
            for(int i=0;i< array.length;i++)
            {
                if(frequency[i]>1)
                {
                    System.out.println(i+"======"+frequency[i]);
                }
            }

        }
    }
