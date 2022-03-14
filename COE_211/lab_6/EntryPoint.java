import java.util.Scanner;

public class EntryPoint {
    public static void main (String[] args) {
        String repeat = ""; 
        do {
            Scanner scan = new Scanner(System.in);
            System.out.println("Which service would you like to use?\n" +
            "[1]: Basic week visualizer\n" +
            "[2]: Advanced week visualizer\n" +
            "[3]: Basic calculator\n" +
            "[4]: Employee repertoire");

            int query = scan.nextInt();

            while (query < 1 || query > 4){
                System.out.println("Please make sure you pick a number between 1 and 4");
                query = scan.nextInt();
            }

            scan.nextLine();

            switch (query){
                case 1:
                BasicWeek basicWeek = new BasicWeek();
                basicWeek.printDays();
                break;
                
                case 2:
                AdvancedWeek advancedWeek = new AdvancedWeek();
                advancedWeek.printDays();
                break;

                case 3:
                new Calculator();
                break;

                case 4:
                new Employee();
            } 
            
            System.out.println("Would you like to perform another operation? (y/n)");
            repeat = scan.nextLine();


        } while (repeat.equalsIgnoreCase("y"));
    }
}