package factoryCode;

public class Test {
	public static void main(String[] args) {
		Operation operation = null;
		double a=5.0,b=0;
		char o = '/'; //ѡ������� ʵ������ͬ����		
		System.out.println("the result is "+OperatorFactory.getResult(a, b, o));
		
	}
}
