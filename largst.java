import java.io.*;
import java.util.Scanner;

public  class  largst{
public static void main(String arr[]){

Scanner sc= new Scanner(System.in);

System.out.println("enter numberf");
int a=sc.nextInt();
System.out.println("enter 2 number");
int b=sc.nextInt();
System.out.println("enter  3 number");
int c=sc.nextInt();
if (a>b &&a>c) {
System.out.println("largest is a:"+a);
    
}else if(b>a && b>c){
    System.out.println("largest is b:"+b);

}else{
System.out.println("largest is a:"+c);

}

}
};