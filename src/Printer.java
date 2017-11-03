import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Printer {
	
	private static Scanner in;
	
	public static void main(String[] args) throws Exception
	{
		System.out.println("Welcome to Bodie's Printer!");
		in = new Scanner( new FileReader("input.txt"));
		
		
		while(in.hasNext()) {
			//add GetNext() to the heap
			GetNext();
		}
		
		//while queue.hasNext(), remove and print min.
		
	}
	
	public static PrintJob GetNext() throws Exception
	{
		String name = in.next();
		int pri = Integer.parseInt(in.next());
		int pag = Integer.parseInt(in.next());
		char type = in.next().charAt(0);
		
		PrintJob pj;
		if(type == 'I')
		{
			pj = new PrintJob(name, pri, pag);
		}
		else if(type == 'O')
		{
			pj = new OutsidePrintJob(name, pri, pag);
		}
		else
		{
			throw new Exception("Type not accepted!");
		}
		
		return pj;
	}
	
}
