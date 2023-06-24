import java.util.Scanner;

public class task1{
     public static void main(String[] args){
        System.out.println("Введите число: ");
        Scanner inputRead = new Scanner(System.in);
        int n = inputRead.nextInt();
        int result = 0;

        for (int i = n; i > 0; i--){
            result = n + result; 
            n -= 1;
        }

        System.out.println(result);
    }
}
        
