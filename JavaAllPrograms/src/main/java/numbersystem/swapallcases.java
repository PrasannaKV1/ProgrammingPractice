package numbersystem;

public class swapallcases {
    public static void main(String[] args) {
        //first cases with third variable
        int a=4,b=5,temp;
        temp=a;
        a=b;
        b=temp;
        System.out.println(a+":"+b);


        //second cases to swap two variables

        int k=5,l=7;
        k=k+l;// 12
        l=k-l;//12-7=5
        k=k-l;//12=5 7
        System.out.println(k+":"+l);

        //third case two swap variables
        int m=3,n=4;
        m=m*n; //3*4=12
        n=m/n;//12/4=3
        m=m/n;//12/3=4
        System.out.println(m+":"+n);

        // fourth case two swap variables
        int  x=10,y=30;
        x=x^y;
        y=x^y;
        x=x^y;
        System.out.println(x+":"+y);





     }
}
