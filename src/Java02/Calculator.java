package Java02;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Addition adcalc=new Addition();
        Subtraction subcalc=new Subtraction();
        Multiplication mulcalc=new Multiplication();
        Divsion divcalc=new Divsion();

        Scanner input=new Scanner(System.in);
        int n1,n2,result1,result2,result3,result4;
        System.out.println("Enter num1");
        n1=input.nextInt();
        System.out.println("Enter num2");
        n2=input.nextInt();
        result1= adcalc.AddOperation(n1,n2);
        result2= subcalc.SubtractionOperation(n1,n2);
        result3= mulcalc.MultiplicationOperation(n1,n2);
        result4= divcalc.DivisionOperation(n1,n2);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);


    }


}
