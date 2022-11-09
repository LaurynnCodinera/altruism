
	import java.util.Scanner;
	
	
	/**
* Name: Laurynn S. Codiñera
* Section: Altruism
* Year: 4th Year
*/

public class Main {
	public static void main(String[] args) {
		float sum = 0;
        float counter = 0;
        float ave = sum/counter;
        boolean repeat = false;
		int input;
		Scanner console = new Scanner(System.in);
            do {
                System.out.print("Do you want to enter grade? YES/NO: ");
                String response = console.next();
                if (response.equals("YES")) {
                    System.out.print("Enter grade: ");
                    float grade = console.nextFloat();
                    sum = sum + grade;
                    counter++;
                    repeat = true;
            }   
                else if (response.equals("NO"))  {
                      if (sum == 0) {
                      System.out.print("Okay, Bye!");
                      repeat = false;    
                      }
                      else {
                        ave = sum/counter;
                        System.out.print("The average is: "+ ave);
                        repeat = false;
                      }
                }
                else if (response.equals("NO"))  {
                    ave = sum/counter;
                    System.out.print("The average is: "+ ave);
                    repeat = false;
            }
                else {
                    System.out.println("ERROR! Please enter a VALID INPUT ");
                    repeat = true;
                }
        } while (repeat);
		console.close();
	}
}