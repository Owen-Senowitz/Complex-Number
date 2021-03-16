/*
 * @author - Owen Senowitz
 * A class for showing off the ComplexNum class
 */
package assg1_senowitzo19;

public class ComplexNumDemo {
	public static void main(String[] args) {
		/*
		 * runs threw each method and shows the return of each method
		 */
		ComplexNum c1 = new ComplexNum();
		c1.setReal(6.0);
		c1.setImaginary(7.0);
		
		ComplexNum c2 = new ComplexNum();
		c2.setReal(-4.0);
		c2.setImaginary(5.0);
		
		ComplexNum c3 = new ComplexNum();
		c3.setReal(6.0);
		
		System.out.println("c1 = " + c1);
		System.out.println("c2 = " + c2);
		System.out.println("Real c1 = " + c1.getReal());
		System.out.println("Real c2 = " + c2.getReal());
		System.out.println("Imaginary c1 " + c1.getImaginary());
		System.out.println("Imaginary c2 " + c2.getImaginary());
		System.out.println("c2 + c1 = " + c2.add(c1));
		System.out.println("c2 - c1 = " + c2.sub(c1));
		System.out.println("c2 * c1 = " + c2.mul(c1));
		System.out.println("c1 Negation = " + c1.neg());
		System.out.println("c1 = c2 = " + c1.equals(c2));
		System.out.println("c1 = c1 = " + c1.equals(c1));
	}
}
