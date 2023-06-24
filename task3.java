import java.util.Scanner;

import javax.xml.transform.Result;

public class task3{
     public static void main(String[] args){
        System.out.println("Введите цифру операции: ");
        System.out.println("1 - сложение");
        System.out.println("2 - вычитание");
        System.out.println("3 - умножение");
        System.out.println("4 - деление");
        Scanner inputRead = new Scanner(System.in);
        int numOp = inputRead.nextInt();
        System.out.println("Введите первое число для операции: ");
        int num1 = inputRead.nextInt();
        System.out.println("Введите второе число для операции: ");
        int num2 = inputRead.nextInt();
        int result;
        
        if (numOp == 1){
            result = num1 + num2;
            System.out.println(result);
        }
        if (numOp == 2){
            result = num1 - num2;
            System.out.println(result);
        }
        if (numOp == 3){
            result = num1 * num2;
            System.out.println(result);
        }
        if (numOp == 4){
            result = num1 / num2;
            System.out.println(result);
        }
    }
}
        
