

public class FunctionsInJava {
	
	//function: data member of the class
	
	//can not create a function inside a func
	//func are always parallel to each other/independent
	//but call a func from another function
	
	//1. with no input and no return:
	//void -> can not return anything
	public void test() {//0 input param
		System.out.println("test method");
	}
	
	public void getInfo() {
		int a = 10;
		int b = 20;
		int c = a+b;
		System.out.println(c);
	}
	
	//2. with no input but some return:
	//return type: int
	public int getBillAmount() {
		System.out.println("getBillAmount");
		int foodBill = 100;
		int tax = 20;
		int finalAmount = foodBill + tax;
		return finalAmount;
	}
	

	public String getTrainerName() {
		System.out.println("get trainer name");
		String name = "Naveen";
		return name;
	}
	
	//3. some input and some return:
	public int add(int a, int b) { //2 params
		System.out.println("adding two numbers");
		int sum = a+b;
		return sum;
	}
	
	public double getTotalMarks(int firstSubject, int secondSubject, double negativeMarking) {
		System.out.println("getting total marks");
		double finalMarks = firstSubject + secondSubject - negativeMarking;
		return finalMarks;
	}
	
	public Float getActualMarks(int firstSubject, int secondSubject, Float negativeMarking) {
		System.out.println("getting total marks");
		Float ActualMarks = firstSubject + secondSubject - negativeMarking;
		return ActualMarks;
	}
		
	
	public static void main(String[] args) {		
		
		FunctionsInJava obj = new FunctionsInJava();
		obj.test();
		obj.getInfo();
//		System.out.println(obj.getBillAmount()-10);
//		System.out.println(obj.getBillAmount()-10+5);

		int m = obj.getBillAmount();
		System.out.println(m-10+5);
		
		String n = obj.getTrainerName();
		System.out.println(n);
		
		int s1 = obj.add(10, 20);
		System.out.println(s1);
		
		int s2 = obj.add(20, 5);
		System.out.println(s2);
		
		double d = obj.getTotalMarks(100, 200, 10.33);
		System.out.println(d);
		
		double ac= obj.getActualMarks(100, 200, (float) 10.33);
		System.out.println("Actual Marks " + ac);
		
		
	}

}
