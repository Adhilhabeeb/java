import java.io.*;
import java.util.Scanner;



public class PRIMENUM {
    

  static boolean  chek(int n){


    if (n<=1) {
        return false;
    }

for (int i = 2; i < n; i++) {
    if (n%i==0) {
        return false;
    }
  
}



return true;

}
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter number");
        int a=sc.nextInt();
for (int index = 0; index < a; index++) {
    if (chek(index)) {
        System.out.println("the number"+index+"is prime");


    }
}



    }
}
