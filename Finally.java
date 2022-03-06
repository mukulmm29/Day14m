class A{
	int a = 89;
	final void plan1() {
		a = 20;
		System.out.println("Print The Value Of a"+a);
	}
	void plan2(){
		System.out.println("I'm In Method 2");
	}
	void plan2(String s) {
	}
}
public class Finally extends A{
  
  void plan2() {
	System.out.println("I am method Plan2 of finalDemo");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
		Finally fd = new Finally();
		a.plan1();
		a.plan2();
		fd.plan2();
	}

}
