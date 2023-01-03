package mainPackage;

public class class1 {
	/*
	  a) write Method to compute a specified formula
	Note :can use this method only within the class 
	Specified Formula :
	4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11))
	*/
	int countMethod1=0;
	static int countMethod2=0;
	private void  methodA() {
		System.out.println(4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11)));
		/*
		 c) Create variable count how many times call first method*/
		countMethod1++;
	}
	
	//////////////////////////////////////////////////////////////
	/*
	 b)write Method to compute body mass index (BMI)
	Note :
	x)can use this method everywhere 
	xx)can call this method in another class without create object
	xxx)BMI = weight * 0.45359237 / (inches * 0.0254 * inches * 0.0254).

	 */
	public static double methodBMI(int weight,int hight) {
		double BMI;
		BMI = weight * 0.45359237 / (hight * 0.0254 * hight * 0.0254);
		/*
		 d) Create variable count how many times call sec method
		 */
		countMethod2++;
		return BMI;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		class1 Obj1=new class1();
		Obj1.methodA();
		System.out.println(methodBMI(452,72));//called with out using obj
	}
	
	
}
