package arrays;

public class MoveALLZeros {

    public static void main(String[] args) {
        int array[]={0,1,0,3,12};
        int len= array.length;
        int temp=array[array.length-1];
        //5
        for (int i = len-2; i >=0; i--) {

                array[i + 1] = array[i];
        }
        array[0]=temp;

        for(int a:array)
        {
            System.out.println(a);
        }


        }
    }
