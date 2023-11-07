public class CoreJavaBrushUp4 {

	public static void main(String[] args) {

		// Calling another method
		CoreJavaBrushUp4 obj = new CoreJavaBrushUp4();
		System.out.println(obj.getData());

		// Calling static method
		getInfo();

		// Calling another class method
		MethodsDemo obj2 = new MethodsDemo();
		System.out.println(obj2.getUserData());

		// Calling another class static method
		MethodsDemo.getUserInfo();
	}

	public String getData() {
		System.out.println("Good Morning");
		return "Hello";
	}

	// Static method
	public static void getInfo() {
		System.out.println("Hi");
	}
}
