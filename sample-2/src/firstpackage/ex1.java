package firstpackage;

public class ex1 {
	
	public static void main(String[] args){
		
		
		ex1 t = new ex1();
		
		t.firstadd(10, 20);
		t.secondadd(30, 20);
	}
		
		void firstadd(int a, int b)
		{
			System.out.println(a+b);
			System.out.println("first addition");
		}
		
		void secondadd(int c, int b)
		{
			System.out.println(b+c);
			System.out.println("second addition");
		}
	}
	
	