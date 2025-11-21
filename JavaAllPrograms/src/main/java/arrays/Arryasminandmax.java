package arrays;

public class Arryasminandmax {
    public static void main(String[] args) {
        // just practicing two solve problems

        int array[]={1,3,4,-1,2,3,7};
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int a:array)
        {
            if(a>max)
            {
                max=a;
            }
            if(a<min)
            {
                min=a;
            }
        }
        System.out.println("the minimum value is "+min);
        System.out.println("the maximum value is "+max);
    }
}
