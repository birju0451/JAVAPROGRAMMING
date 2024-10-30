public class StringBufferExample {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("navin");
        System.out.println("Initial capacity: " + sb.capacity());  // StringBuffer has an additional 16 bytes of capacity
        sb.append(" kumar");
        System.out.println("StringBuffer content: " + sb);
        
        String str = sb.toString();
        System.out.println("Converted to String: " + str);

        // Checking data types using instanceof
        if (sb instanceof StringBuffer) {
            System.out.println("sb is of type StringBuffer");
        }
        if (str instanceof String) {
            System.out.println("str is of type String");
        }
    }
}
