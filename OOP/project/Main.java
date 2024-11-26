import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //regular array format is datatype []name = new datatype [size]
        // since is a type of data type but it isnt a primitive data type
        //details [] id = new details [10];
        ArrayList <details> id= new ArrayList<details>();
        int counter=0;
        int check=0;
        while (check!=-1) {

            System.out.println("\nWelcome to ABC Banking Customer Info System");
            System.out.println("*******************************************");



            System.out.print("Enter the name of your account : ");
            String name = scanner.nextLine();
            //System.out.println();
            //System.out.println("Enter the amount to deposit :");
            //double amount = scanner.nextDouble();
            //System.out.println("Enter the amount to withdraw :");
            //double withdraw = scanner.nextDouble();
            System.out.print("Enter gender : ");
            String gender = scanner.nextLine();
            System.out.print("Enter Address : ");
            String address = scanner.nextLine();
            System.out.print("Enter Phone number : ");
            String phonenumber = scanner.nextLine();

            // accepts string input and turns it to integer
            System.out.print("Enter age : ");
            int age = Integer.parseInt(scanner.nextLine());
            System.out.print("Enter acc number : ");
            int accnumber = Integer.parseInt(scanner.nextLine());
            System.out.print("Enter marital status : ");
            boolean marital_status = Boolean.parseBoolean(scanner.nextLine());
            //id[counter] =new details(name, age, gender, marital_status, accnumber, address, phonenumber);
            id.add(new details(name, age, gender, marital_status, accnumber, address, phonenumber));
            counter++;
            System.out.print("Press -1 to stop : " );
            // the use of Integer.parseInt(scanner.nextLine()); is important is using scanner.nextLine()
            // in 2nd loop will cause the name input to be skipped
            check=Integer.parseInt(scanner.nextLine());
            System.out.println();

        }
        //id.get(0).balance=0;
        for (int indexact=0;indexact<id.size(); indexact++) {
            System.out.println("***************************************************");
            System.out.println("Please Enter "+id.get(indexact).name +"\'s current Financial Information ");
            System.out.print("Enter amount deposited :");
            id.get(indexact).deposit= Double.parseDouble(scanner.nextLine());
            System.out.print("Enter amount withdrawn :");
            id.get(indexact).withdraw= Double.parseDouble(scanner.nextLine());
            id.get(indexact).balance=id.get(indexact).balance+id.get(indexact).deposit-id.get(indexact).withdraw;
            System.out.println(id.get(indexact).name+" current balance is "+id.get(indexact).balance);
        }
        System.out.println("***************************************************");


        for (int idx=0; idx<id.size(); idx++) {
            System.out.println("***************************************************");
            //id [idx].display();
            id.get(idx).display();
        }
        System.out.println("***************************************************");
    }
}
