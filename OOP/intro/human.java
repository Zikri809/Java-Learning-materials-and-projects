public class human {
    // to receive and data when creating the object so that
    //it can have unique identity/attributes
    String name;
    int age;
    double weight;

    //name of constructor must be same as the class name
    human(String name, int age, double weight) {
        // function of this.name eg. like student.name
        //in other words lie [object].attribute
        this.name=name;
        this.age=age;
        this.weight=weight;
    }
    void eating(){
        System.out.println(this.name+" is eating");
    }
    void sleep(){
        System.out.println(this.name+" is sleeping");
    }
}
