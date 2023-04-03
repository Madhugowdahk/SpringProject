import java.util.*;
 public class Str {
    public static void main(String[] args)
    {
        // string builder in java -is a class used to create mutable
        // string builder is a mutable sequence of charcters
        StringBuilder sb=new StringBuilder("madhugowda");
        System.out.println(sb);
        //charAt 0);
        System.out.println(sb.charAt(0));
// set chartat0
 sb.setCharAt(0, 'a');
System.out.println(sb);
// insert 
sb.insert(0, 's');
//delete
sb.delete(3, sb.length()-4);
System.out.println(sb);

    }
}
