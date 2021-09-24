
public class US2Metric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("inches\t centimeters\t pounds\t kilograms\t");
		System.out.println("------\t -----------\t ------\t ---------\t");
		
		int i=1;
		
		for(double i1=1; i1<=50; i1++) {
			double x= i1*2.54;
			double y = i1*0.45359237;
		System.out.print(i1+ "\t ");
		System.out.printf("%.4f",x);
		System.out.print(" \t " + i1 + "\t " );
		System.out.printf("%.4f",y);
		System.out.println();
		}
		
		
		
		
	}

}
