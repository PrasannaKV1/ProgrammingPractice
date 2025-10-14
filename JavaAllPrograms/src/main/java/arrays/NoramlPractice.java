package arrays;

public class NoramlPractice {
    public static void main(String[] args) {
        int array[] ={0,0,0,1,2,3};
        //nan ivaga array elements yavduu zero idiyo  avan last ge push madbeku
        int index=0;
        for (int i = 0; i < array.length ; i++) {
            {
                if(array[i]!=0)
                {
                    array[index++]=array[i];
                }

            }


        }
        while(index< array.length)
        {
            array[index++]=0;
        }

        for (int k = 0; k < array.length ; k++) {
            System.out.println(array[k]);

        }

    }
}
