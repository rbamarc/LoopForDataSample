package netbeans.loopfordatasample;
import java.util.Scanner;
/**
 *
 * @author halfrikan
 */
public class LoopForDataSample {

    public static void main(String[] args) {
        
        Scanner myScanner = new Scanner(System.in);
        
        while (true){
            System.out.println("Enter some data");
            
            String input = myScanner.nextLine();
            
            if(input.isEmpty()){
                //User hits enter without entering data. Display error then back to
                //top of loop
                System.out.println("You did not enter anything!");
            } else {
                //User entered something, leave the loop
                System.out.println("you have entered: " + input);
                break;
            }
        }
    }
}
