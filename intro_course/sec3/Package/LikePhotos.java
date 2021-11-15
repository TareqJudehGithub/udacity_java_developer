public class LikePhotos {
  public static void main(String[] args){

    System.out.println(LikePhotos.photos("Nice photo!", true));
    System.out.println(LikePhotos.photos("Big like!", true));
    System.out.println(LikePhotos.photos("Cool picture!", false));
    System.out.println("\n");
    

  }
  // total likes counter
  static int numberOfLikes = 0;

  public static int photos(String comment, boolean like) {
    
    // print out comment
    System.out.println("\n" + comment);

    // increase number of likes
    if (like) {
    
      numberOfLikes++;
    }
    
    // print out current number of likes
    return numberOfLikes;  
  }

}

