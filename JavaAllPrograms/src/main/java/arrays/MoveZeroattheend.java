package arrays;

public class MoveZeroattheend {

    public static void main(String[] args) {
        int array[]={0,1,0,3,12};
        int bigindex=0;
        for (int i = 0; i < array.length ; i++) {
                      if(array[i]!=0)
                      {
                          array[bigindex++]=array[i];
                      }
        }
        while(bigindex< array.length)
        {
           array[bigindex++]=0;
        }

        for(int a:array)
        {
            System.out.println(a);
        }

    }
}
