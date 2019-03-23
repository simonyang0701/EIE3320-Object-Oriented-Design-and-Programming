public class ClassC extends ClassB{
	int x =3;
	public void commonMethod(){
		super.commonMethod();
		System.out.println("Class C");
	}
	public void newMethod(){
		super.commonMethod();
	}
}