import java.util.LinkedList;
import java.util.Scanner;

class student{
    int ID;
    String name;
    int age;
    double height;
    double weight;
    double current_cgpa;

    student(int ID, String name, int age, double height, double weight, double current_cgpa){
        this.ID = ID;
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.current_cgpa = current_cgpa;

    }
    void display(){
        System.out.println("ID: " + ID);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
        System.out.println("Weight: " + weight);
        System.out.println("Current CGPA: " + current_cgpa);
    }

}

public class Main {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<student> linkedList = new LinkedList<>();

        for (int x = -1; x!=0;) {
            System.out.println("1-Add Data\n2-Find Data based on ID\n3-Delete Data based on element");
            System.out.print("Enter Operation you want to perform: ");
            int operation = Integer.parseInt(sc.nextLine());
            switch(operation) {
                case 1:
                    for (int i = 2; i != 0; ) {
                    System.out.println();
                    System.out.print("Enter student ID: ");
                    int ID = Integer.parseInt(sc.nextLine());
                    System.out.print("Enter student name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter student age: ");
                    int age = Integer.parseInt(sc.nextLine());
                    System.out.print("Enter student height: ");
                    double height = Double.parseDouble(sc.nextLine());
                    System.out.print("Enter student weight: ");
                    double weight = Double.parseDouble(sc.nextLine());
                    System.out.print("Enter student current_cgpa: ");
                    double current_cgpa = Double.parseDouble(sc.nextLine());

                    linkedList.offer(new student(ID, name, age, height, weight, current_cgpa));
                    System.out.print("Enter 0 to stop adding: ");
                    i = Integer.parseInt(sc.nextLine());
                    System.out.println();
                }
                    break;
                case 2:
                //finding student based on id
                    for (int i = -1; i != 0; ) {
                    System.out.println();
                    int elementindex;
                    boolean foundflag=false;
                    System.out.print("ID that you wanted to find:");
                    int searchid = Integer.parseInt(sc.nextLine());
                    for (int j = 0; j < linkedList.size(); j++) {
                        if (searchid == linkedList.get(j).ID) {
                            elementindex = j;
                            foundflag=true;
                            System.out.println();
                            linkedList.get(elementindex).display();
                        }
                    }
                    if (foundflag!=true){
                        System.out.println("Such ID does not exist in the linked list/No data in the Linked list");
                    }
                    System.out.print("Enter 0 to stop searching: ");
                    i = Integer.parseInt(sc.nextLine());
                    System.out.println();

                }
                    break;
                case 3:
                    for (int i = -1; i != 0; ) {
                        System.out.println();
                        int elementindex;
                        boolean foundflag=false;
                        System.out.print("ID that you wanted to delete:");
                        int deleteid = Integer.parseInt(sc.nextLine());
                        for (int j = 0; j < linkedList.size(); j++) {
                            if (deleteid == linkedList.get(j).ID) {
                                elementindex = j;
                                foundflag=true;
                                System.out.println();
                                System.out.println("Below Data are deleted");
                                linkedList.get(elementindex).display();
                                linkedList.remove(elementindex);
                            }
                        }
                        if (foundflag!=true) {
                            System.out.println("Such ID does not exist in the linked list/No data present in the Linked list");
                        }
                        System.out.print("Enter 0 to stop deleting: ");
                        i = Integer.parseInt(sc.nextLine());
                        System.out.println();
                    }
                    break;

                default: System.out.println("Invalid Operation Code\n");
            }
            System.out.print("Enter 0 to terminate the program: ");
            x = Integer.parseInt(sc.nextLine());
            System.out.println();
        }
    }
}