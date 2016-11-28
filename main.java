
	package myPack;
	import java.util.Scanner;

	public class main {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			Stack st;
			
			st= new fixedStack(0);
			System.out.println("Enter an integer Within 20");
			int b = sc.nextInt();
			st.push(b);
			st.pop();
			
			st = new variableStack(10);
			int c = sc.nextInt();
			st.push(c);
			st.pop();
		
			
	}
}


