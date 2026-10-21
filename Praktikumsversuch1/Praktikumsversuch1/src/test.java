import java.util.Scanner;

public class test {

    public static double getNumberDouble(Scanner scanner, String text){
        System.out.println("Enter "+text);
        while(!scanner.hasNextDouble()){
            System.out.println("Non valid input");
            scanner.next();
        }
        return scanner.nextDouble();
    }

    public static int getNumberInt(Scanner scanner, String text){
        System.out.println("Enter "+text);
        while(!scanner.hasNextInt()){
            System.out.println("Non valid input");
            scanner.next();
        }
        return scanner.nextInt();
    }

     public static long getNumberLong(Scanner scanner, String text){
        System.out.println("Enter "+text);
        while(!scanner.hasNextLong()){
            System.out.println("Non valid input");
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

    public static long gcd(long dividend, long divisor){
        long rest;
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
        do{
            System.out.println("Calculator - please select:\n0: end program\n1: add\n2: subtract\n3: multiply\n4: divide\n5: Sinus\n6: exponentation\n7: greates common divisor\n8: nth fibonacci");
            i = getNumberInt(scanner, "menu number");
            switch(i){
                case 0:
                    System.out.println("end program");
                    break;
                case 1:
                    System.out.println("\nAddition");
                    System.out.println("result: "+add(getNumberDouble(scanner, "first summand"), getNumberDouble(scanner, "second summand"))+"\n");
                    break;
                case 2:
                    System.out.println("\nSubtraction");
                    System.out.println("result: "+subtract(getNumberDouble(scanner, "minuend"), getNumberDouble(scanner, "subtrahend"))+"\n");
                    break;
                case 3:
                    System.out.println("\nMultiplication");
                    System.out.println("result: "+multiply(getNumberDouble(scanner, "first factor"), getNumberDouble(scanner, "second factor"))+"\n");
                    break;
                case 4:
                    System.out.println("\nDivision");
                    System.out.println("result: "+divide(getNumberDouble(scanner, "dividend"), getNumberDouble(scanner, "divisor"))+"\n");
                    break;
                case 5:
                    System.out.println("\nSinus");
                    System.out.println("result: "+sinus(getNumberDouble(scanner, "angle (rad)"))+"\n");
                    break;
                case 6:
                    System.out.println("\nExponentiation");
                    System.out.println("result: "+exponentation(getNumberDouble(scanner, "base"), getNumberDouble(scanner, "exponent"))+"\n");
                    break;
                case 7:
                    System.out.println("\nGreates common divisor");
                    System.out.println("result: "+gcd(getNumberLong(scanner, "first number"), getNumberLong(scanner, "second number"))+"\n");
                    break;
                case 8:
                    System.out.println("\nnth fibonacci");
                    System.out.println("result: "+fibonacci(getNumberInt(scanner, "n"))+"\n");
                    break;
                default:
                    System.out.println("Non valid input ");            
                }
        }while (i!=0);
        scanner.close();
    }
}