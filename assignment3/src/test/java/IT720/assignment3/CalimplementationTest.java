package IT720.assignment3;

import static org.mockito.Mockito.*;

import junit.framework.TestCase;

public class CalimplementationTest extends TestCase {
	
	Calimplementation obj;
	int a,b;
	double c;
    
	protected void setUp() throws Exception {
		obj = new Calimplementation();
		a=3;
		b=5;
		Calcinterface mockObj = mock(Calcinterface.class);
		when(mockObj.add(a, b)).thenReturn(a+b);
		obj.setCalc(mockObj);
		
		when(mockObj.multiply(a, b)).thenReturn(a*b);
		obj.setCalc(mockObj);
		
		when(mockObj.divide(a, b)).thenReturn ( ((double)a/(double)b));
		obj.setCalc(mockObj);
		

	}
     public void testAddTwoNums() {
		
		assertEquals(8, obj.addTwoNums(a, b));
		
		
	}
     public void testmultiplyTwoNums() {
 		
 		assertEquals(15, obj.multiplyTwoNums(a, b));
 		
 		
 	}
     
     public void testdivideTwoNums() {
  		
  		assertEquals(0.6, obj.divideTwoNums(a, b));
  		
  		
  	}
	
	protected void tearDown() throws Exception {
		obj = null;
		a=0;
		b=0;
		}

}
