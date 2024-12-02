package Level1;

public class conversion {
	
	String add(int a, int b) {

		return "add: "+(a+b);}
	
		String sub(int a, int b) {	
		return "sub : "+(a-b);}
			
		String mul(int a,int b) {
		return "mul : "+(a*b);
	}
		String div(int a,int b) {
		return "div : "+(a/b);
		}
		String modu(int a,int b) {
		return "modu : "+(a%b);}
	
	public static void main(String[] args) {
		conversion sc=new conversion();
		
		 String num1 =sc.add(10, 20);
		 System.out.println(num1);
		 
		  String num2 =sc.sub(10, 20);
		  System.out.println(num2);
		  
		 String num3 =sc.mul(10,20);
		 System.out.println(num3);
		 
		 String num4 =sc.div(10,20);
		 System.out.println(num4);
		 
		 String num5 =sc.modu(10,20);
		 System.out.println(num5);
		 
		 
		
	}
}