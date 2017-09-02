/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package montlysalary;
import java.util.Scanner;
/**
 *
 * @author Yo
 */
public class MontlySalary {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        System.out.println("Unify Ltd");
        
        System.out.print("Please enter the department: ");
        String userPrompt = scan.nextLine();
        
      
       if(userPrompt.equalsIgnoreCase("Personal")){
            PersonalDep personal = new PersonalDep("Personal");
            System.out.printf("%s%n",personal);
            personal.isCalculatingBonus();
            personal.displayInfo();
        }
        else if(userPrompt.equalsIgnoreCase("Inventory")){
            InventoryDep inventory = new InventoryDep("Inventory");
            System.out.printf("%s%n", inventory);
            inventory.isCalculatinBonus();
            inventory.displayInfo();
        }
        else{
            throw new IllegalArgumentException("Error. Please try again");
        }
       
        
        
}
}
