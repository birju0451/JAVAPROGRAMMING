/*
 * 1.In Java, String and StringBuffer are both classes used for handling strings,
   but they havesignificant differences in terms of mutability, performance, and usage. Here's breakdown
 * 2. Mutability
    String: Immutable, meaning once created, the value of a String object cannot be changed. Any modification creates a new String object.
    StringBuffer: Mutable, meaning it allows modification of its contents without creating a new object.
4. Usage
    String: Use for fixed or rarely modified strings, such as constants.
    StringBuffer: Use for strings that require frequent modification in a single-threaded context. For multithreaded applications, StringBuilder is generally preferred over StringBuffer due to its non-synchronized methods (making it faster).
 */

public class diffBtStringAndStringBuffer {
    public static void main(String[] args) {
        String str = "Hello";
        str += " World";  // Creates a new String object each time it's modified.
        System.out.println(str);

        StringBuffer sb = new StringBuffer("Hello");
        sb.append(" World");  // Modifies the same object without creating a new one.
        System.out.println(sb);
       
    }
    
}
