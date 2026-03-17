package Pattern;
import java.util.*;
public class p1 {
     public static void main(String args[]){
          int i , j;
          String str="*";
          Scanner sc=new Scanner(System.in);
          int num=sc.nextInt();

          for(i=0 ; i<=num ; i++){
            for(j=0 ; j<=i ; j++){
                    System.out.print(str);
            }
            System.out.println();
          }
    }
}
