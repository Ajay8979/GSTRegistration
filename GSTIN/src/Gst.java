public class Gst  {

	public static final int FIRST_MARK=1;
	
	public static void main(String[] args) {
	
		int[] marks= {FIRST_MARK,2,3};
		printAllMarks(marks,0);

		/*
		 * long number = 0l; Random rand = new Random(); number
		 * =(rand.nextInt(1000000)+1000000000l) * (rand.nextInt(900)+100); StringBuffer
		 * str = new StringBuffer("TRN");
		 * 
		 * str.insert(0, number);
		 * 
		 * System.out.print("After insertion = "); System.out.println(str.toString());
		 * 
		 */
	}
	private static void printAllMarks(int[] marks,int count) {
		for(int mark:marks) {
			System.out.println(mark);
		}
	}
}
