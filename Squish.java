import java.util.*;
public class Squish {

	public static double squishA (double input) {
		return (input+100.0)/200.0;
	}
	
	public static double CloseToBoundaryA (double input) {
		return (0.5-Math.abs(.5-input) )/2.0;
	}
	
	public static void main(String[] args) {
		double[] inputs = {0, 0.000027535691114583473, 0.004070137715896128, 0.18242552380635635, 0.2689414213699951, 0.425557483188341, 0.47178002201963243, 0.5, 0.5768852611320463, 0.6813537337890256, 0.7858349830425586, 0.8797431375322491, 0.9993891206405656, 1, 1};
		for(int i=0;i<inputs.length;i++) {
			System.out.println(inputs[i]+":"+CloseToBoundaryA(inputs[i]));
		}
	}
}
