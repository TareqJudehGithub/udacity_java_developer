package PracticeReturn;

/**
 * Testing and practising the return statement.
 * @author Tareq
 */
public class PhotoLikes {
    public static void main(String[] args){
        photos("Nice photo!", true);
        photos("WOW amazing!", true);
//        System.out.println(photos("Oh YEAH!", true));

        // print out total number of likes:

        System.out.println("Likes = " + photos("Oh yea!", true));

        System.out.println(greetUsers("Ali"));

    }
    /**
     * A method computing numbers of likes a photo gets
     */
    static  int totalLikes = 0;
    public static int photos(String comment, boolean isLike){
        // print out comment argument
        System.out.println(comment);

        // check if a user likes the photo
        if (isLike){
            totalLikes++;
        }
//        System.out.println("Likes inside: " + totalLikes);
        return totalLikes;
    }
    public static String greetUsers(String username){
        return "Hello, " + username;
    }
}
