import java.util.Scanner;

public class test {

    public static double[] getNumbers(){
        Scanner scanner1 = new Scanner(System.in);
        double[] numbers=new double[2];
        for(int i=0; i<2; i++){
            System.out.println("Enter "+(i+1)+". number: ");
            while(!scanner1.hasNextDouble()){
                System.out.println("No valid input\nEnter "+(i+1)+". number: ");
                scanner1.next();
            }
            numbers[i]=scanner1.nextDouble();
        }
        return numbers;
    }

    public static double add(double numbers[]){
        return numbers[0]+numbers[1];
    }

    public static double subtract(double numbers[]){
        return numbers[0]-numbers[1];
    }

    public static double multiply(double numbers[]){
        return numbers[0]*numbers[1];
    }

     public static double divide(double numbers[]){
        return numbers[0]/numbers[1];
    }

    public static void main(String[] args){
        int i;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("Calculator - please select:\n0: end program\n1: add\n2: subtract\n3: multiply\n4: divide");
            while(!scanner.hasNextInt() ){
                System.out.println("No valid input 1 \n");
                scanner.next();
                System.out.println("Calculator - please select:\n0: end program\n1: add\n2: subtract\n3: multiply\n4: divide");
            }
            i = scanner.nextInt();
            switch(i){
                case 0:
                    System.out.println("end program");
                    break;
                case 1:
                    System.out.println("add\nresult: "+add(getNumbers())+"\n");
                    break;
                case 2:
                    System.out.println("sub \nresult: "+subtract(getNumbers())+"\n");
                    break;
                case 3:
                    System.out.println("mul \nresult: "+multiply(getNumbers())+"\n");
                    break;
                case 4:
                    System.out.println("div\nresult: "+divide(getNumbers())+"\n");
                    break;
                default:
                    System.out.println("No valid input ");
            }
            
        }while (i!=0);
    
    }
}
