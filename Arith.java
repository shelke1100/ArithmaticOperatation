import java.util.Scanner;

public class Arith {
    public static void main(String args[])
     {
        Arith rc = new Arith();
        Scanner sc = new Scanner(System.in);
        int ch;
        do {
            System.out.println("1] Addition");
            System.out.println("2] Subtraction");
            System.out.println("3] Multiplication");
            System.out.println("4] Division");
            System.out.println("0] Exit");
            System.out.println("Enter the operation:");
            ch = sc.nextInt();
            
            switch (ch) 
            {
                case 1:
                    rc.addition();
                    break;
                case 2:
                    rc.subtraction();
                    break;
                case 3:
                    rc.multiplication();
                    break;
                case 4:
                    rc.division();
                    break;
                case 0:
                    System.out.println("Exiting program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
                    break;
            }
        } while (ch != 0);
    }

    int a;
    int b;
    int c;

    public void setArth(int a, int b) {
        c = a + b;
    }

    public int getArth() {
        return c;
    }

    public void setSubtraction(int a, int b) {
        c = a - b;
    }

    public int getSubtraction() {
        return c;
    }

    public void setMultiplication(int a, int b) {
        c = a * b;
    }

    public int getMultiplication() {
        return c;
    }

    public void setDivision(int a, int b) {
        
            c = a / b;
    }
       
    public int getDivision() {
        return c;
    }

    public void addition() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        a = sc.nextInt();
        System.out.println("Enter the second number:");
        b = sc.nextInt();
        setArth(a, b);
        System.out.println("Addition of two numbers is " + getArth());
    }

    public void subtraction() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        a = sc.nextInt();
        System.out.println("Enter the second number:");
        b = sc.nextInt();
        setSubtraction(a, b);
        System.out.println("Subtraction of two numbers is " + getSubtraction());
    }

    public void multiplication() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        a = sc.nextInt();
        System.out.println("Enter the second number:");
        b = sc.nextInt();
        setMultiplication(a, b);
        System.out.println("Multiplication of two numbers is " + getMultiplication());
    }

    public void division() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the dividend:");
        a = sc.nextInt();
        System.out.println("Enter the divisor:");
        b = sc.nextInt();
        setDivision(a, b);
        System.out.println("Division result is " + getDivision());
    }

    
}
