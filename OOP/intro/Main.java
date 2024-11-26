//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        human student1 = new human("Zikri",19,69);
        System.out.println(student1.name);
        System.out.println(student1.weight);
        System.out.println(student1.age);
        student1.eating();
        student1.sleep();
        System.out.println();
        human student2 = new human("Andy",25,75);
        System.out.println("Name "+student2.name);
        System.out.println("Age "+student2.age);
        System.out.println("Weight "+student2.weight);
        student2.eating();
        student2.sleep();
    }
}
