package mathmaticaloperations;

public class BitWiseOperatorsExample {

	public static void main(String[] args) {
     int a =4; // -(a+1) for complement
     int b=6;
     System.out.println("A & B " +(a&b));
     System.out.println("A | B " +(a|b));
     System.out.println("A ^ B " +(a^b));
     System.out.println("~A " +(~a));
     System.out.println(" ~B " +(~b));
     System.out.println("A >> B " +(a>>b));
     System.out.println("A << B " +(a<<b));
     System.out.println("A >>>B " +(a>>>b));
	}

}
