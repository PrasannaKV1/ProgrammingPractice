package arrays;

public class MinAndMax1 {
    public static void main(String[] args) {
        int array[]={1,2,-34,56,78,90};
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
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
        System.out.println("The minimum value of array is "+min);
        System.out.println("The maximum value of the array is "+max);
    }
}
