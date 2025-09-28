package arrays;

public class Twosum {

    public static void main(String[] args) {
        int array[] ={2,7,8,9,10};
        int target =9;
        int answer[]=result(array,target);
        {
            for(int a:answer)
            {
                System.out.println(a);
            }
        }

    }
    public static int [] result(int array[],int target)
    {
        for(int i=0;i<array.length;i++)
        {
            for(int j=i+1;j< array.length;j++)
            {
                if((array[i]+array[j])==target)
                {
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
