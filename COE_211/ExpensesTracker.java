import java.io.*;  // Import the FileWriter class
import java.io.IOException;  // Import the IOException class to handle errors
import java.util.Scanner;

public class ExpensesTracker{
  public static void main(String[] args){
  
    try {
      // Create FileWriter & Scanner objects & y/n string
      FileWriter fw = new FileWriter (new File("expenses.txt"), true);
      BufferedWriter bw = new BufferedWriter(fw);
      PrintWriter outToFile = new PrintWriter(bw);

      Scanner scan = new Scanner(System.in);
      Scanner fileScan = new Scanner(new File("expenses.txt"));

      String yesNo = "y";
      String name = "";
      String purchasedItem = "";
      
      double paidAmount = 0;

      // Start gathering information inside the loop you will start
        do {
            System.out.println("Input your name: ");
            name = scan.nextLine();

            System.out.println("What did you purchase?");
            purchasedItem = scan.nextLine();

            System.out.println("How much did you pay? (in USD)");
            paidAmount = scan.nextDouble();
            scan.nextLine();

            outToFile.println(name + " purchased " + purchasedItem + " for " + paidAmount + " US Dollars.");

            System.out.println("Would you like to log another purchase? (y/n)");
            yesNo = scan.nextLine();

        } while (yesNo.equalsIgnoreCase("y"));

        outToFile.close();

        if (yesNo.equalsIgnoreCase("n")) {
          System.out.println("Would you like to read a summary of your purchases?");
          yesNo = scan.nextLine();
          if (yesNo.equalsIgnoreCase("y")) {
            while (fileScan.hasNext()){
              System.out.println(fileScan.nextLine());
            }
          }
        }
        
      // Close ClassWriter & Scanner objects
        fileScan.close();
        scan.close();
        
      // If you have already have a expenses.txt file, you need to delete it
      // before you compile your code again

    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
}