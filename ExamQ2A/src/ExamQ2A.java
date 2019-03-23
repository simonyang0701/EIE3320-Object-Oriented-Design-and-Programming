public class ExamQ2A {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 5;
		ClassD obj = new ClassD();
		//System.out.println(super.x);
		System.out.println(x);
		System.out.println(obj.x);
		System.out.println(((InterfaceA) obj).x);
		System.out.println(((ClassB) obj).x);
		System.out.println(((ClassC) obj).x);
		InterfaceA a = new ClassD();
		a.commonMethod();
	}

}