package Interpreter;


public class Processor {
	private int A=0,B=0,C=0;
	
	public Processor() {		
	}
	
//-------------------------------------------------------------------------------------------------------------------	
	
	public int Get_A() {
		return A;
	}
	
//-------------------------------------------------------------------------------------------------------------------
 	
	public int Get_B() {
		return B;
	}
	
//-------------------------------------------------------------------------------------------------------------------
	
	public int Get_C() {
		return C;
	}
	
//-------------------------------------------------------------------------------------------------------------------	
	
	public void Set_A(int x) {
		A=x;
	}
		
//-------------------------------------------------------------------------------------------------------------------
	 	
	public void Set_B(int x) {
		B=x;
	}
		
//-------------------------------------------------------------------------------------------------------------------
		
	public void Set_C(int x) {
		C=x;
	}	
//-------------------------------------------------------------------------------------------------------------------
	
	public void SetValue(String P1, int P2) {
		switch (P1) {
		case "A":
			A=P2;
			break;
		case "B":
			B=P2;
			break;
		case "C":
			C=P2;
			break;
		}
	}	
}