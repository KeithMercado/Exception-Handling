import java.util.*;

public class ExceptionNow{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        while(true){

        try {
  
            int num1, num2;
            num1 =0;
            num2 =0;
            double result =0;

            System.out.print("Enter num1: ");
            num1 = input.nextInt();

            System.out.print("Enter num2: ");
            num2 = input.nextInt();

            if (num2 == 0)
                throw new DivisionZeroException("Zero division is not allowed!");

            result = (double) num1 / num2;

            System.out.println("Result is " + result);
        
        
        }

        catch (InputMismatchException e) {
            System.out.println("Only integers are allowed for input");
        }

        catch (DivisionZeroException e){
            System.out.println(e.getMessage());
        }
        finally {
            input.close();
            System.out.println("Program is terminated");
            System.exit(0);
        }
    }
    }
}