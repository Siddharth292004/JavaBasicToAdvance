// Create a class Student with properties name, age, and print them using an object.

package Class.FirstClass;

class Student {
    String name;
    int age;

    void printDetails(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }
}
public class FirstClass {
    public static void main(String [] args){
        Student s1 = new Student();
        s1.name = "Jitendra";
        s1.age = 23;

        s1.printDetails();
    } 
}
