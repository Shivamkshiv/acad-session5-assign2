package myPack;
public class variableStack implements Stack {

    int I1;
	
	public variableStack(int i) {
		super();
		this.I1 = I1;
	}

	@Override
	public void push(int I) {
		if(I>I1){ 
			I1=I;      // it can exceeds the size of number of integers
			System.out.println("The new range of integers is "+I);
			
		}
		
		
	}

	@Override
	public int pop() {
		
		return I1;
	}

}
