package datastructure;

public class AddingReversingTwoStrings {
	public static void reverse(String s)
	{
		
	        int x = s.length()/ 2;
	        int y = s.length();
	 
	        String p = "";
	        while (x > 0 && y > s.length()/2) {
	 
	            
	            char ch = s.charAt(x - 1);
	            p += ch;
	            x--;
	 
	     
	            ch = s.charAt(y - 1);
	            p += ch;
	            y--;
	        }
	 
	        System.out.println(p);
	}
public static void main(String[] args) {
	String s="carbohydrates";
	reverse(s);
}
}