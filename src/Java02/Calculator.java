package Java02;

import java.util.Scanner;

public class Calculator extends ParentCalculator{

    public static void main(String[] args) {

        Calculator obj=new Calculator();

        Scanner input=new Scanner(System.in);
        int n1,n2,result1,result2,result3,result4;
        System.out.println("Enter num1");
        n1=input.nextInt();
        System.out.println("Enter num2");
        n2=input.nextInt();
        result1= obj.AddOperation(n1,n2);
        result2= obj.SubtractionOperation(n1,n2);
        result3= obj.MultiplicationOperation(n1,n2);
        result4= obj.DivisionOperation(n1,n2);

        System.out.println("Addition: "+result1);
        System.out.println("Subtraction: "+result2);
        System.out.println("Multiplication: "+result3);
        System.out.println("Division: "+result4);


    }


}
