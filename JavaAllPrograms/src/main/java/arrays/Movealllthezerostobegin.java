package arrays;

public class Movealllthezerostobegin {
    public static void main(String[] args) {
        int num[]={0,0,5,0,2,0,1};
        int biginindex=0;

        //first pass to  fill the zero elements
        for (int i = 0; i < num.length; i++) {
            if(num[i]==0)
            {
                num[biginindex]=0;
                biginindex++;
            }
        }


        //second pass to store the other elements

        for (int k = 0; k < num.length ; k++) {
            if(num[k]!=0)
            {
                num[biginindex]=num[k];
                biginindex++;
            }
        }

        for(int a :num)
        {
            System.out.println(a);
        }

        
    }
}
