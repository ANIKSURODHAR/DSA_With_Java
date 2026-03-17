import java.util.*;
public class factorial {

          public static long multifl(int n){
                  long fact=1;
                  for(int i=1;i<=n;i++){
                    fact*=i;
                  }
                  return fact;  
          }
          public static void main(String args[]){
                 Scanner sc=new Scanner(System.in);
                 int n=sc.nextInt();
                 long res=multifl(n);
                 System.out.println(res);

          }
}
