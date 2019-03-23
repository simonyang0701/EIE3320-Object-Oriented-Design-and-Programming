
public class ExamQ1B {

	/**
	 * @param args
	 */
	private int abcd;
	public ExamQ1B()
	{
		this(0);
	}
	public ExamQ1B(int abcd)
	{
		this.abcd = abcd;
	}
	public void print()
	{
		System.out.println(abcd);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExamQ1B obj = new ExamQ1B(2);
		obj.print();

	}

}
