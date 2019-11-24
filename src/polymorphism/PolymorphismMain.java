package polymorphism;

public class PolymorphismMain {

	public void initPolymorphism()
	{
		Addition addition = new Addition();
		int sumFor2Integers = addition.add(23, 24);
		System.out.println("Addition with 2 integers: "+sumFor2Integers);
		int sumFor3Integers = addition.add(2,  45, 21);
		System.out.println("Addition with 3 integers: "+sumFor3Integers);
		double sumFor2Decimals = addition.add(39.8, 4.4);
		System.out.println("Addition with 2 decimals: "+sumFor2Decimals);
		
		Addition addition_integer = new Addition(4, 93);
		System.out.println("Addition with constructor overload: "+addition_integer.addInt());
		
		Addition addition_double = new Addition(34.89, 1.23);
		System.out.println("Addition with constructor overload: "+addition_double.addDouble());
	}
}
