package SignletonDesignPattern;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class Singleton {

//    this is the access point
//    for any object that is created from this class
//    since object will not be needed on a global basis, we used static keyword here.
    private static Singleton firstInstance = null; // we have a static variable to hold our one instance of the class Singleton

// why the constructor private?
// to make sure there is only instance from the class.
// by using constructor private the user will not able to call it.
    private Singleton() {}

//    getInstance is universally used method for singleton pattern.
    public static Singleton getInstance() {

        if (firstInstance == null) {
//          this is known as lazy instantiation
//          that means
//          if the instance isn't needed, it is never going to be created
            firstInstance = new Singleton();
        }
        return firstInstance;
    }

}
