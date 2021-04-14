
public class Squish {

	public static double squishA (double input) {
		return (input+100.0)/200.0;
	}
	
	public static void main(String[] args) {
		double[] inputs = { -10.5, -5.5, -1.5, -1, -0.3, -0.113, 0, 0.31, 0.76, 1.3, 1.99, 7.4}; //only inputs applicable to option A (between -100 and 100) are in this array
		for(int i=0;i<inputs.length;i++) {
			System.out.println(inputs[i]+":"+squishA(inputs[i]));
		}
	}
}
