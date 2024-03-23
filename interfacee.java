/**
 * 
 */
package abstraction;

abstract class  A{
	 abstract public void bill();
	 abstract public void main();
}
interface B {
	void display();
}
 class C extends A  implements B {
	String name;
	int    roll;
	String s1;
	double id;
	
	//@Override
	public void main(String name,int roll) {
		System.out.println(" NAME :"+name);
		System.out.println(" Roll : " + roll);
	}
	//@Override
	public void bill(String s1,double id) {
		System.out.println(" ID   : "+id);
		System.out.println(" Grate:"+s1);
	}
	@Override
	public void display() {
		System.out.println("  list; ");
	}
}
public class interfacee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  C c1=new C();
    c1.display();
    c1.main(" alex ",21);
    c1.bill(" A+  ",4.5);
	}

}
