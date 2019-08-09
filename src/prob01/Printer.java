package prob01;

public class Printer {
	private int i;
	private boolean a;
	double b;
	String name;
	
	
	public void println(int i, boolean a, double b,String name) {
		this.i=i;
		this.a=a;
		this.b=b;
		this.name=name;
	}


	public void println(int j) {
		System.out.println(j);
		
	}


	public void println(double d) {
		System.out.println(d);
		
	}


	public void println(boolean c) {
		System.out.println(c);
		
	}


	public void println(String name) {
		System.out.println(name);
		
	}






	
}
