package IT720.assignment3;

public class Calcimplementation1 {
	
	Calcinterface1 calc1;
	
	public int subtractTwoNums (int a, int b) {
		 return calc1.subtract(a, b);
  }

	public void setCalc1(Calcinterface1 calc1) {
		this.calc1 = calc1;
	}

}
