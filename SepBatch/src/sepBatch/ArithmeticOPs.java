package sepBatch;

public class ArithmeticOPs {

	public int Add(int a,int b) {
		int c = a+b;
		return c;
	}
	public static void main(String[] args) {
		ArithmeticOPs obj1 = new  ArithmeticOPs();
		int n= obj1.Add(10,20);
		System.out.println("Additoion of two nos" +n);
		
		
	}

}
