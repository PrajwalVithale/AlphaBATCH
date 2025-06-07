// class Student{
//     String name;
//     int marks;
// }

class Vehicle{
    void println(){
        System.out.println("Base class vehicle");
    }
}

class Car extends Vehicle{
    void println(){
        System.out.println("Derived class Car");
    }
}

public class practiceOOPS {
    public static void main(String[] args) {
        Vehicle obj1=new Car();
        obj1.println();

        Vehicle obj2=new Vehicle();
        obj2.println();

        // Student s=new Student();
        // s.name="Prajwal Vithale";
        // System.out.println(s.name);
    }
}
