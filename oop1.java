
// for every single student
class Student{ /*A Class is a template that defines general properties that every object has.
    A class is a template for an object and an object is an instance (physical representation) of a class.
    Class is a logical construct and object is a physical reality(i.e., it occupies space in memory)
    */
    int rno;
    String name;
    float marks;
    
    Student () {
        // this is how you call a constructor from another constructor
        // when we are using 'this' while creating an object,then it replaces it with:
        // internally: new Student (13, "default person", 100.0f);
        this (13, "default person", 100.0f);

    } 
    
    // Student s3 = new Student(17, "Arpit", 89.7f);
    // here, 'this' will be replaced with s3.
    Student(int rno, String name, float marks){
        this.rno = rno;    // A constructor is a special function that defines what happens when an object is created,
        this.name = name;  // i.e., it allocates values to instance variables and instantiates an object.
        this.marks = marks;
        // to initialise the values of the instance variables for every object, we use 'this' keyword
        // to access every object
        // whenever we try to access any particular property of the class via its object, we use 'this' keyword.
        // 'this' keyword is just replacing 'this' with the name of the reference variable.
        // used to refer to the current object,i.e. reference to the object on which the method was invoked.


    }

    void greeting(){
        System.out.println("Hello! My name is:" + this.name);
    }

    void changeName(String newName) {
        this.name = newName;
    }

    Student(Student other) { // Constructor that takes values from another object
        this.name = other.name;
        this.rno = other.rno;
        this.marks = other.marks;
    }

}

class A {
    final int num = 10;
    String name;

    public A(String name){
        this.name  = name;
    }
}

public class oop1{
    public static void main(String[] args) {
        
        /*store data of 5 students: {roll no, name, marks}
        We want a data structure in which every single element contains {roll no, name, marks}
        or if we want to create our own data type, it can be done using clsses
        Class is a named group of properties and functions.
        Objects have 3 essential charecteristics:
        (i) State of the object: value from its data type
        (ii) Identity of the object: whether both refernce var point to different objects.
            two reference var pointing to the same object, if any change is done to the object
            by any reference var, it will be reflected by the second reference var as well
        (iii) Behaviour of the object: effect of the data type operations
        To access the properties of an object, we use the dot('.') operator.
        The dot operator links the reference variable with the instance variable. (like s1.rollno,etc)
        
        */
        Student[] sarr = new Student[5]; // array of student objects
        //Student s1; //This reference variable is of type 'Student' and it contains 3 properties : {roll no, name, marks}
        //            //rn only a refernce variable s1 is DECLARED of the type 'Student'.
        //s1 = new Student(); // The 'new' operator dynamically allots(i.e., allocates the memory at run time) and returns a reference to it.
        // ALL CLASS' OBJECTS IN JAVA MUST BE ALLOCATED DYNAMICALLY.

        Student s1 = new Student(13, "Kunal Kushwaha", 85.4f); // to bind these arguments with the object, we call the parameterised constructor.
        s1.greeting();
        // s1.changeName("Anime Lover");
        // System.out.println("After changing the name: "+s1.name);
        // Whenever we say (ref var name.sth inside the class), 'this' is replaced with the name of 
        // the ref var.
        
        Student random = new Student(s1);
        System.out.println("Random student details:\n");
        System.out.println("Name:" + random.name);
        System.out.println("Roll No:" + random.rno);
        System.out.println("Marks:" + random.marks);

        Student s2 = new Student(18, "Rahul Rana", 90.3f);

        Student s3 = s1;
        s1.name = "Something something";
        System.out.println("Name of s3: " + s3.name);

        // 'final' is a keyword using which you can prevent your content from being modified.
        // So, it has to be always initialised while declaring
        //'final' guarantees the immutability of primitive data types reference variables only

        final A kunal = new A("Kunal Kushwaha");
        kunal.name = "other name"; // ALLOWED - you can change the value inside the object
        // when a non primitive is final, you cannot reassign it.
        // kunal = new A("new object");    // NOT ALLOWED - since kunal is a 'final' object, it cannot point to a different object
        A obj = new A ("abcdefg");
        System.out.println(obj);

    }
}