package arrays;

public class MaxAndMinSingle {
    public static void main(String[] args) {

        int array[]={2,5,6,7,8,9,1};

        int result[] =maxandmin(array);

        for(int a:result)
        {
            System.out.println(a);
        }

    }

    public static int[] maxandmin(int array[])
    {
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
        return new int[]{max,min};
    }



}
