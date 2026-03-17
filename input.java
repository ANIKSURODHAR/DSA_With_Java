import java.util.*;

public class input {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
       //for Integer
        int num1=sc.nextInt();
        sc.nextLine();
        System.out.println(num1);

       //for String
        String str=sc.nextLine();
        System.out.println(str);

       //for Boolean
        Boolean bo=sc.nextBoolean();
        System.out.println(bo);

       //for Double
        double num2=sc.nextDouble();
        System.out.println(num2);

    }      
}
