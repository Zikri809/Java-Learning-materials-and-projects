public class details {
    String name, gender, address,phonenumber;
    int age,accnumber;
    boolean marital_status;
    double deposit,withdraw, balance;
    details(
            String name,
            int age,
            String gender,
            boolean martial_status,
            int accnumber,
            String address,
            String phonenumber
    )
    {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.accnumber = accnumber;
        this.phonenumber=phonenumber;
        this.marital_status=martial_status;
    }
    details(
            double balance,
            double deposit,
            double withdraw
    ){
        this.balance=balance;
        this.deposit=deposit;
        this.withdraw=withdraw;
    }





    void display(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Gender: "+gender);
        System.out.println("Address: "+address);
        System.out.println("Acc number: "+accnumber);
        System.out.println("Phonenumber: "+phonenumber);
        System.out.println("Marital status: "+marital_status);
        System.out.println("Deposit: "+deposit);
        System.out.println("Withdraw: "+withdraw);
        System.out.println("Balance: "+balance);
    }
}
