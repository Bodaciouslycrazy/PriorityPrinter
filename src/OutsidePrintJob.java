
public class OutsidePrintJob extends PrintJob {

	public OutsidePrintJob(String n, int pri, int pag) {
		super(n, pri, pag);
	}
	
	//------------------------
	//    Extra Method
	//------------------------
	
	public float calculateCost()
	{
		return (float) (pages * .1);
	}

}
