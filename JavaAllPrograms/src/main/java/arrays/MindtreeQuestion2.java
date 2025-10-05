package arrays;

import java.util.Arrays;

public class MindtreeQuestion2 {

    public static void main(String[] args) {

        int array1[]={1,2,3,4};
        int array2[]={11,22,33,44};
        int array3[]={111,222,333,444};
        int n1 = array1.length;
        int n2= array2.length;
        int n3=array3.length;
        int result[]=new int[n1+n2+n3];
        for (int i = 0; i < array1.length; i++) {
            result[i]=array1[i];
        }
        for (int k = 0; k < array2.length ; k++) {
            result[n1+k]=array2[k];
        }
        for (int l = 0; l < array3.length ; l++) {
           result[n1+n2+l]=array3[l];
        }
        //merging is done
        // now i'm  gonna print the values
        for(int a:result)
        {
            System.out.println(a);
        }

        //Arrays.sort(result);
        int expected[] =new int[n1+n2+n3];

        int index=0;

        for(int i=0;i< array1.length;i++)
        {
            expected[index++]=array1[i];
            expected[index++]=array2[i];
            expected[index++]=array3[i];
        }

        for(int a :expected)
        {
            System.out.println(a);
        }

    }
}
