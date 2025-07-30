
import java.io.*;
import java.util.Scanner;
   class stdent {
  int rollno;
  String name ;
  String classdiv;
    

  void insertvalue( int ro,String name,String div){

   this.rollno=ro;
   this.name=name;
   this.classdiv=div;
  this.displayva();
  }
  void displayva( ){

    System.out.println("rollnu:  "+rollno);
    System.out.println("name:  "+name);
    System.out.println("classdiv:  "+classdiv);

  }
  }

public class classstd {
   

    public static  void main(String arr[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the num,name,divison");
        int n=sc.nextInt();
        String name=sc.next();
        String clasdiv=sc.next();

        stdent std=new stdent();
        std.insertvalue(n,name,clasdiv);
       

    }
}
