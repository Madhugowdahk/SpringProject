package LibraryManagementSystem;

import java.util.ArrayList;

public class Main {
	
		public static void main(String[] args) {
			
		
	
Book book1=new Book(12, "java", "programming", "jamesgosling", "sapnabook", 200);

Book book2=new Book(13, "c++", "programming", "dennis", "sapnabook", 280);

Book book3=new Book(14, "python", "programming", "john", "sapnabook", 380);

ArrayList< Book>a=new ArrayList<>();
a.add(book1);
a.add(book2);
a.add(book3);

for(int i=0;i<=a.size();i++)
{
	System.out.println(a.get(i));
}

for(Book b:a)
{
	System.out.println(b);
}

}

}