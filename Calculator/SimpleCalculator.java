package Calculator;

import java.util.Scanner;

public class SimpleCalculator {
    Scanner sc=new Scanner(System.in);
double sum=0;
double num1;
double num2;
int exit=1;
    public  void simpleCalculator() {

        System.out.println("Enter NO");
        num1=sc.nextDouble();
        while (exit!=0){
        System.out.println("perss   + for add");
        System.out.println("perss   - for sub");
        System.out.println("perss   * for  multiply");
        System.out.println("perss   / for divide");
         String operator= sc.next();
        switch (operator) {

            case "+":
                System.out.println("Enter  Another no");
                num2= sc.nextDouble();
                if (sum==0.0){
              sum+=num1+num2;
               }else {
                sum+=num2;}
              break;
            case "-":
                System.out.println("Enter Another no");
                num2= sc.nextDouble();
                if (sum==0.0){
                    sum-=num1-num2;
                    }else {
                     sum-=num2;}
                break;
            case "*":
                System.out.println("Enter Another no");
                num2= sc.nextDouble();
                if (sum==0.0){
                    sum+=num1*num2;
                }else {
                    sum*=num2;}
                break;

            case "/" :
                System.out.println("Enter Another no");
                num2= sc.nextDouble();
                if (sum==0.0){
                    sum+=num1/num2;
                }else {
                    sum/=num2;}
                break;

            // match the value of week

        }
            System.out.println("Do you want to continue");
            System.out.println("presss 1 for continue");
            System.out.println("presss 0 for break");
             exit=sc.nextInt();


        }

        System.out.println(sum);
    }



    public static void main(String[] args) {
  SimpleCalculator c=new SimpleCalculator();
  c.simpleCalculator();
    }
}
