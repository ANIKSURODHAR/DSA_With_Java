import java.util.*;

public class prime_check {

  public static boolean is_prime(int n){

         if(n==1) return false;
         if(n==2) return true;

         int sqr_number=(int)Math.sqrt(n);
         for(int i=2;i<=sqr_number+1;i++){
           if(n%i==0){
              return false;      
           }
         }
         return true;
  }
  public static void main(String argd[]){
          Scanner sc=new Scanner(System.in);
          int number=sc.nextInt();


          Boolean decision=is_prime(number);
          if(decision){
              System.out.println("This is a prime number");
          }
          else{
              System.out.println("This number is not prime");
          }

 }
}
