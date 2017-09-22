package IT720.assignment3;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import junit.framework.TestCase;

public class CalcimplementationTest1 extends TestCase {
	
	Calcimplementation1 obj;
	int a,b;

	protected void setUp() throws Exception {
		obj = new Calcimplementation1();
		a=3;
		b=5;
		
		Calcinterface1 mockObj = mock(Calcinterface1.class);
		when(mockObj.subtract(a, b)).thenReturn(a-b);
		obj.setCalc1(mockObj);
		
	}
	 public void testsubtractTwoNums() {
			
			assertEquals(-2, obj.subtractTwoNums(a, b));
			
		}

	
		
	

    protected void tearDown() throws Exception {
    	obj = null;
		a=0;
		b=0;

  }
}