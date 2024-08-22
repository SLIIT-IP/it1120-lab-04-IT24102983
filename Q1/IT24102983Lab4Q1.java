import java.util.Scanner;

     public class IT24102983Lab4Q1 {
         public static void main(String[] args) {
             Scanner Scanner=new Scanner (System.in);
             System.out.println("Enter a number");
             int number= Scanner.nextInt();
             if(number>0){
               System.out.println("This is a positive number");
             } 
			 else if (number<0){
               System.out.println("This is a negative number");
             }
             else{
               System.out.println("The number you entered is zero");
             }
             Scanner.close();
   }
}