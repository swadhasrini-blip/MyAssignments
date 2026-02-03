package week1.day1;

public class LibraryManagement {
	
	
	public static void main(String[] args)
	{
		Library lib = new Library();
		String bookTit = lib.addBook("IKIGAI");
		System.out.println(bookTit);
		lib.issueBook();
		
	}
	

}
