/**
 * 
 */
package abstraction;
  
interface haier{
	void lenova();
	//void tell();	
	//void HP();
	//void aceser();
}
    class order  implements haier{
	
	String name;
	int version;
	int rate;
	public  void lenova(String s,int a,int b) {
		System.out.println("COMPANY NAME:"+name);
		System.out.println(" MODEL VERSION:"+version);
		System.out.println(" RATE:"+rate);
		
	}

	//@Override
	/*public void tell (){
		System.out.println("COMPANY NAME:"+name);
		System.out.println(" MODEL VERSION:"+version);
		System.out.println(" RATE:"+rate);
		
	}

	@Override
	public void HP() {
		System.out.println("COMPANY NAME:"+name);
		System.out.println(" MODEL VERSION:"+version);
		System.out.println(" RATE:"+rate);*/
		
	//}

	//@Override
	//public void aceser() {
		// TODO Auto-generated method stub
	//	System.out.println("COMPANY NAME:"+name);
	////	System.out.println(" MODEL VERSION:"+version);
	//	System.out.println(" RATE:"+rate);
	//}
	
//}


public class interfaces {	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  order o1 = new order();
 o1.lenova();;
 //o1.HP(); 
// o1.aceser();
// o1.tell();




	}

}}
