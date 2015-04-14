package maximo_comun_divisor;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class EuclyTest {

	private Eucly eucly;
	
	@Before
	public void setUp(){
		eucly = new Eucly();
	}
	
	@Test
	public void mcd(){
		assertEquals(eucly.mcd(4, 24), 4);
		
		assertEquals(eucly.mcd(24, 4), 4);
		
		assertEquals(eucly.mcd(22, 24), 2);
	}
	
	@Test
	public void mcm(){
		assertEquals(eucly.mcm(2, 4), 4);
		
	}
}
