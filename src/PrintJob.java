
public class PrintJob implements Comparable<PrintJob> {
	
	private String name;
	private int userPriority;
	private int pages;
	
	public PrintJob(String n, int pri, int pag)
	{
		name = n;
		userPriority = pri;
		pages = pag;
	}
	
	//-----------------------
	//         GETTERS
	//-----------------------
	public String getName()
	{
		return name;
	}
	
	public int getUserPriority()
	{
		return userPriority;
	}
	
	public int getPages()
	{
		return pages;
	}
	
	public int calculatePriority()
	{
		return pages * userPriority;
	}
	
	//-------------------------------
	//        CompareTo
	//-------------------------------
	public int compareTo(PrintJob j) {
		return calculatePriority() - j.calculatePriority();
	}
}
