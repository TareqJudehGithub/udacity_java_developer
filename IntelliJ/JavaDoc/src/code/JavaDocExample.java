package code;

/** This is my first JavaDoc. It greets the username.
 * @author Tareq Judeh
 * */
public class JavaDocExample {
    public static void main(String[] args){
        System.out.println(JavaDocExample.greetUser("John Smith"));

    }
    /** Method that greets the username
     * @param string username provides the username text
     * @return  Returns Hello, string username */
    public static String greetUser(String username) {
        return "Hello, " + username + "!";
    }
}
