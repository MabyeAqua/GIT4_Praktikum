import java.util.Scanner;

public class calculator {

    public static double getNumberD(Scanner scanner){
        while(!scanner.hasNextDouble()){
            System.out.println("No valid input");
            scanner.next();
        }
        return scanner.nextDouble();
    }

    public static int getNumberI(Scanner scanner){
        while(!scanner.hasNextInt()){
            System.out.println("No valid input");
            scanner.next();
        }
        return scanner.nextInt();
    }

     public static long getNumberL(Scanner scanner){
        while(!scanner.hasNextLong()){
            System.out.println("No valid input");
            scanner.next();
        }
        return scanner.nextLong();
    }

    public static double add(double summand1, double summand2){
        return summand1+summand2;
    }

    public static double subtract(double minuend, double subtrahend){
        return minuend-subtrahend;
    }

    public static double multiply(double factor1, double factor2){
        return factor1*factor2;
    }

    public static double divide(double dividend, double divisor){
        return dividend/divisor;
    }

    public static double sinus(double angle){
        return Math.sin(angle);
    }

    public static double exponentation(double base, double exponet){
        return Math.pow(base, exponet);
    }

    public static long gcd(long number1, long number2){
        long dividend, divisor, rest;
        if(number1>=number2){
            dividend=number1;
            divisor=number2;  
        }
        else{
            dividend=number2;
            divisor=number1;
        }
        do{
            rest=dividend%divisor;
            dividend=divisor;
            divisor=rest;
        } while(rest!=0);
        return dividend;
    }   

    public static long fibonacci(long n){
        if(n<=1){
            return n;
        }
        return fibonacci(n-1)+fibonacci(n-2);
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int i;
        double[] numbersD = new double[2];
        long[] numbersL = new long[2];
        do{
            System.out.println("Calculator - please select:\n0: end program\n1: add\n2: subtract\n3: multiply\n4: divide\n5: Sinus\n6: exponentation\n7: greates common divisor\n8: nth fibonacci");
            i = getNumberI(scanner);
            switch(i){
                case 0:
                    System.out.println("end program");
                    break;
                case 1:
                    System.out.println("Addition\nEnter first summand");
                    numbersD[0]=getNumberD(scanner);
                    System.out.println("Enter second summand");
                    numbersD[1]=getNumberD(scanner);
                    System.out.println("result: "+add(numbersD[0], numbersD[1])+"\n");
                    break;
                case 2:
                    System.out.println("Subtraction\nEnter minuend");
                    numbersD[0]=getNumberD(scanner);
                    System.out.println("Enter subtrahend");
                    numbersD[1]=getNumberD(scanner);
                    System.out.println("result: "+subtract(numbersD[0], numbersD[1])+"\n");
                    break;
                case 3:
                    System.out.println("Multiplication\nEnter first factor");
                    numbersD[0]=getNumberD(scanner);
                    System.out.println("Enter second factor");
                    numbersD[1]=getNumberD(scanner);
                    System.out.println("result: "+multiply(numbersD[0], numbersD[1])+"\n");
                    break;
                case 4:
                    System.out.println("Division\nEnter dividend");
                    numbersD[0]=getNumberD(scanner);
                    System.out.println("Enter divisor");
                    numbersD[1]=getNumberD(scanner);
                    System.out.println("result: "+divide(numbersD[0], numbersD[1])+"\n");
                    break;
                case 5:
                    System.out.println("Sinus\nEnter angle (rad)");
                    numbersD[0]=getNumberD(scanner);
                    System.out.println("result: "+sinus(numbersD[0])+"\n");
                    break;
                case 6:
                    System.out.println("Exponentiation\nEnter base");
                    numbersD[0]=getNumberD(scanner);
                    System.out.println("Enter exponent");
                    numbersD[1]=getNumberD(scanner);
                    System.out.println("result: "+exponentation(numbersD[0], numbersD[1])+"\n");
                    break;
                case 7:
                    System.out.println("Greates common divisor\nEnter first number");
                    numbersD[0]=getNumberL(scanner);
                    System.out.println("Enter second number");
                    numbersD[1]=getNumberL(scanner);
                    System.out.println("result: "+gcd(numbersL[0], numbersL[1])+"\n");
                    break;
                case 8:
                    System.out.println("nth fibonacci\nEnter n");
                    numbersL[0]=getNumberL(scanner);
                    System.out.println("result: "+fibonacci(numbersL[0])+"\n");
                    break;
                default:
                    System.out.println("No valid input ");            
                }
            
        }while (i!=0);
        scanner.close();
    }
}
