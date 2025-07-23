
import java.io.*;
import java.util.Scanner;




public class sumarr {
    
    public  static  void main( String arr[]){
        int sum=0;

        Scanner sc= new Scanner(System.in);
        System.out.println("enter numberf");
        int n=sc.nextInt();

        int a[]= new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i]=sc.nextInt();
        
            sum+=a[i];
        }
        

        System.out.println("aummmm"+sum);

        int avg=sum/n;
        System.out.println("avg"+avg);

    }
}
