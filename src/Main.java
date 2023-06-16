
public class Main {

	public static void main (String[] args) {
		
		LazyNumberDetails number = new LazyNumberDetails(23);

			number.updateNumber(10);
			System.out.println("number.updateNumber(10);");
			System.out.println("\t**none (lazy eval.)**    -> no user action");
			number.updateNumber(17);
			System.out.println("number.updateNumber(17);");
			System.out.println("\t**none (lazy eval.)**    -> no user action");// (3)  
			System.out.println("number.isPrime();");
			System.out.println("\t!!intensiveComputation!! -> prime algorithm for 17 -> " + number.isPrime());
			System.out.println("number.isPrime();");
			System.out.println("\t**cached**               -> saved result from prime alg -> " + number.isPrime());  
			number.updateNumber(28);
			System.out.println("number.updateNumber(28);");
			System.out.println("\t**none (lazy eval.)**    -> no user action");
			System.out.println("number.isPerfect();");
			System.out.println("\t!!intensiveComputation!! -> perfect algorithm for 28 -> " + number.isPerfect());
			System.out.println("number.isPrime();");
			System.out.println("\t!!intensiveComputation!! -> prime algorithm for 28 -> " + number.isPrime());
			System.out.println("number.isPerfect();");
			System.out.println("\t**cached**               -> saved result from perfect alg -> " + number.isPerfect());
			System.out.println("number.isMagic();");
			System.out.println("\t!!intensiveComputation!! -> magic algorithm for 28 - > " + number.isMagic());
			System.out.println("number.isPrime();");
			System.out.println("\t**cached**               -> saved result from prime alg -> " + number.isPrime());
			number.updateNumber(12);
			System.out.println("number.updateNumber(12);");
			System.out.println("\t**none (lazy eval.)**    -> no user action");
			System.out.println("number.isMagic();");
			System.out.println("\t!!intensiveComputation!! -> magic algorithm for 12 -? " + number.isMagic());
			System.out.println("number.isMagic();");
			System.out.println("\t**cached**               -> saved result from magic alg -? " + number.isMagic());
			
	}
}
