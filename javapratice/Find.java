import java.util.*;
public class Find {
    void evenorodd(int num1){
        if(num1%2==0){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
    }
       public static void main (String args[]){
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the number:");
        int num=scan.nextInt();
        Find obj=new Find();
        obj.evenorodd(num);
        

    }
}
