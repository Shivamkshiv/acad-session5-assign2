package myPack;
public class fixedStack implements Stack {

    int I; // Instance Variable I
	
	public fixedStack(int I) { // Constructor
		super();
		this.I = I;
	}

	@Override
	public void push(int I) {
		if(I>20){  
			System.out.println("Stack overflow"); // if integer exceeds 20 then it prints this statement
			
		}
		
	}

	@Override
	public int pop() {
		
		
		return 0;
	}
	
}
