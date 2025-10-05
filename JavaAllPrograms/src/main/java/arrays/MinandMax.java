package arrays;

public class MinandMax {

    public static void main(String[] args) {
        int array[]={-199 ,2,3,4,5};

        // now calling the min and maximum functions to print the values
        System.out.println("The maximum value of the array "+maximum(array));
        System.out.println("The minimum value of the array "+minimum(array));


    }

    public static int maximum(int array[])
    {
        int max=Integer.MIN_VALUE;

        //im using the for-each loop to iterate over the array elements
        for(int a:array)
        {
            if(a>max)
            {
                max=a;
            }
        }

        return max;
    }

    public static int minimum(int array[])
    {
        int min=Integer.MAX_VALUE;

        //using for-each loop for iterating over the values
        for(int b:array)
        {
            if(b<min)
            {
                min=b;
            }
        }


        return min;
    }

}
