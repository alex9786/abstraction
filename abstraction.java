/**
 * 
 */
package abstraction;
abstract  class main{
	abstract void still();			
	abstract void give();
	public void till() {
	System.out.println(" ALEX KING ");
	}
}
class base extends main{
	@Override
	    void still() {			
		for(int i=1;i<=5;i++){
		for(int s=1;s<=5-i;s++){			
	    System.out.print(" ");
		  }	
		for(int j =1;j<=i*2-1;j++){
	    System.out.print("A");
		  }
	    System.out.println(); }
	      }
	@Override
	void give() {
		System.out.println(" NATURAL NUMBERS");
	}
 }
public class abstraction {
	public static void main(String[] args) {
		
     base b1 = new base();
     b1.still();
     b1.give();
     b1.till();
	
	
	}

}
