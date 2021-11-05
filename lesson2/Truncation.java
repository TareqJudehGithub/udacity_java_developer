class Truncation {
  public static void main(String[] args) {

    /* 
    Truncation
     - Truncation is the loss of precision when going from one type of data to
       another manually. Basically, we are cutting off or "truncating" the additional 
       data.
     - If we truncate 3.9, we get simply 3! Since there isn't enough space in 
       smaller data type  (for instance 4 bytes for an int comparing that number
       to 8 bytes for double/float), the extra data is simple cut off 
       (truncated).
    */

    double number = 3.9;
    int intNum = (int)number;

    System.out.println(intNum);
  }
}