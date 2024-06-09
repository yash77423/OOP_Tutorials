package Desktop.Java_Tutorials.KunKus;

public class oop2 {
    // A static property is common to all objects, does not depend on objects
    // Since a static variable is shared by all objects, it is accessed via its class name, not an object reference
    // static variables and static methods belong to a class and not any object
    // Because static variables are independent of any specific object, they are useful 
    // when you need to maintain information that is applicable to an entire class

    // When a member is declared static, it can be accessed before
    // any objects of its class are created, and without reference to any object


    // a non-static method belongs to an instance(object). 
    // so a non-static method is dependent on objects while a static method is not, so
    // That's why we can access only static data/methods inside a static method
    // because a non-static method would require an instance but the static method
    // in which you are using it does not depend on instances

    // We can access non-static data/methods by referencing their instances (creating an object for them)
    // in a static context.

}