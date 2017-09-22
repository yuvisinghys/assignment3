package IT720.assignment3;

public class Calimplementation {

	 Calcinterface calc;
	
	 public void setCalc(Calcinterface calc) {
		this.calc = calc;
	}

	public int addTwoNums (int a, int b) {
		 return calc.add(a, b);
	}	 
	public int multiplyTwoNums (int a, int b)	{
		return calc.multiply(a, b);
	}
	public double divideTwoNums (int a, int b)	{
		return calc.divide(a, b);
	}
   
}