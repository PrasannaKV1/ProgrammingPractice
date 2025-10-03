package arrays;

public class MoveZerotoend {
    public static void main(String[] args) {
        int array[]={0,1,0,3,12};
        for (int i = 0; i < array.length-1; i++) {
            if(array[i]==0)
            {
                array[i+1]=array[i];
            }

        }
        for(int a:array)
        {
            System.out.println(a);
        }
    }
}
