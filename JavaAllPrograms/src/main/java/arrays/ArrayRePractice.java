package arrays;

public class ArrayRePractice {

    public static void main(String[] args) {
        int array[]={1,0,0,1,2,3,4};
        int beginindex=0;
        for (int i = 0; i <array.length ; i++)
            {
                if(array[i]!=0)
                {
                    array[beginindex++]=array[i];
                }
            }

            while(beginindex< array.length)
            {
                array[beginindex++]=0;
            }

            //ivaga for-each loop use madi values print madbeku



        for(int a:array)
        {
            System.out.println(a);

        }
    }
}
