package Projects.Dummy;

import java.util.Scanner;

public class multi {


    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter number");
       int i = sc.nextInt();
       if(i>0){
           for(int j=1; j<=10; j++){
               int k = i*j;
             System.out.println(k);  
           }
       }
       else{
            System.out.println("Give positive number");
       }
    }
}
