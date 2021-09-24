
public class TempConvert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("Fahrenheit\t Celsius\t");	
		double x= 1;
		
		for(double i = 0; i <=212; i = i+2)
		{
			x = (i-32)/1.8;
			System.out.print(i +  "\t \t ");
			System.out.print(x + " \t \t");
			System.out.println();
			
		}
		
		System.out.println();
		
		System.out.println("Fahrenheit\t Celsius\t");
		double y = 1;
		
		for(double i = 0; i <=212; i = i+2)
		{
			y = (i*1.8)+ 32;
			System.out.print(i +  "\t \t ");
			System.out.print(y + " \t \t");
			System.out.println();
			
		}
		
		
		
	}

}
