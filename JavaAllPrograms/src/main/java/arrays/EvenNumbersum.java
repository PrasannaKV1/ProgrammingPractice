package arrays;

public class EvenNumbersum {
    public static void main(String[] args) {
        int array[]={1,3,4,5,6,-7,8,9};
        int evensum=0;
        for (int i = 0; i < array.length ; i++) {
            if(i%2==0)
            {
                evensum+=array[i];
            }
        }
        System.out.println(evensum);

    }
}
