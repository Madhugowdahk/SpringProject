package datastructure;
/*Input: str[] = {“geeks”, “for”, “skeeg”} 
Output: geeks 
“geeks” is the first string from the array whose reverse is also present in the array i.e. “skeeg”.
Input: str[] = {“there”, “you”, “are”} 
Output: -1 
 */
public class firstrevandcheckit {
	public static void reverse(String []str)
	{
		String s=" ";
		for(int i=0;i<str.length;i++)
		{
			  
			for(int j=str[i].length()-1;j>=0;j--)
			{
				s=s+str[i].charAt(j);
			
			}
			break;
			
		}
		System.out.println(s);
		for(int i=0;i<str.length;i++)
		{
			System.out.println(str[i]);
		   if(s==(str[i]))
		   {
			   System.out.println(str[i]+" ");
		   }
		   else
		   {
			   System.out.println("no such element");
		   }
		}
		
		}
	
	
public static void main(String[] args) {
	String []str= {"geeks","for","skeeg"};
reverse(str);	
}
}
