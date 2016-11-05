package pkg;

import org.junit.Test;
import java.lang.*;

public class CalculatorTest {
	
@Test
public  void testAddcalculator(){
	Calculater c=new Calculater();
	org.junit.Assert.assertEquals(3, c.addTwoNumber(1,2));

}
@Test (expected = ArithmeticException )
public void errorhandling(){
	
}
}
