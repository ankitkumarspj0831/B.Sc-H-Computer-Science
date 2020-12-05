import java.util.Scanner;

class Person {
    String firstname;
    String lastname;
    int age;
    char gender;
    String ssn;
    int heightincm;

    Person(String firstname, String lastname, int age, char gender, String ssn, int heightincm) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.gender = gender;
        this.ssn = ssn;
        this.heightincm = heightincm;
    }

    void display() {
        System.out.println("The name of the person is " + firstname + " " + lastname);
        System.out.println("The age of the person is " + age);
        System.out.println("The gender of the person is " + gender);
        System.out.println("The SSN of the person is " + ssn);
    }
}

public class Employee extends Person {
    String company;
    String department;
    int expyears;
    int salary;
    // Use of static variable
    static int count = 0;

    Employee(String firstname, String lastname, int age, char gender, String ssn, int heightincm, String comp,
            String depart, int years, int salary) {
        super(firstname, lastname, age, gender, ssn, heightincm);
        this.company = comp;
        this.department = depart;
        this.expyears = years;
        this.salary = salary;
        count++;
    }

    // Method Overriding
    void display() {
        // Using super for accessing super class display() method
        super.display();
        // Using super key for attribute
        System.out.println("The height of the person is " + super.heightincm + " cms");
        System.out.println("The person is currently working in " + company);
        System.out.println("The department of the person is " + department);
        System.out.println("The experience of the person is " + expyears + " years");
        System.out.println("The salary of the person is " + salary);
    }

    // Method Overloading
    void display(String overloading) {
        System.out.println("This is an example of " + overloading);
    }

    public static void main(String args[]) {
        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter the first name: ");
        String fname = scnr.nextLine();
        System.out.println("Enter the second name: ");
        String lname = scnr.nextLine();
        System.out.println("Enter the age: ");
        int age = scnr.nextInt();
        System.out.println("Enter the gender: ");
        char gender = scnr.next().charAt(0);
        System.out.println("Enter the ssn: ");
        String ssn = scnr.nextLine();
        ssn = scnr.nextLine();
        System.out.println("Enter the height in cms: ");
        int height = scnr.nextInt();
        System.out.println("Enter the company: ");
        String company = scnr.nextLine();
        company = scnr.nextLine();
        System.out.println("Enter the department: ");
        String department = scnr.nextLine();
        System.out.println("Enter the experience years: ");
        int year = scnr.nextInt();
        System.out.println("Enter the salary: ");
        int salary = scnr.nextInt();
        scnr.close();

        // Company department expyears salary

        Person obj1 = new Person(fname, lname, age, gender, ssn, height);
        Person obj2 = new Employee(fname, lname, age, gender, ssn, height, company, department, year, salary);
        Employee obj3 = new Employee(fname, lname, age, gender, ssn, height, company, department, year, salary);
        // Run Time Polymorphism
        System.out.println();
        System.out.println("Display method of Super class: ");
        obj1.display();
        System.out.println();
        System.out.println("Display method of Sub class: ");
        obj2.display();
        obj3.display("Method Overloading");
        System.out.println();
        System.out.println("Value of static variable is: " + count);
    }
}
