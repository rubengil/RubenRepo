package fecha;

import static org.junit.Assert.*;

import org.junit.Test;

public class FechaTest {

	private Fecha fechaCorrecta = new Fecha(20,6,2008);
	private Fecha mesmal1 = new Fecha (21, 0, 3000);
	private Fecha mesmal2 = new Fecha (21,13,3000);
	private Fecha diamal1 = new Fecha (0,11,2000);
	private Fecha diamal2 = new Fecha (32,11,2000);
	private Fecha diamalnov = new Fecha (31,11,2000);
	private Fecha diabiendic = new Fecha (31,12,2000);
	
	@Test
	public void test() {
		testFechaCorrecta();
		testMesMal();
		testDiaMal();
		testDiaMalNov();
		testDiaBienDic();
	}

	private void testDiaBienDic() {
		assertTrue (diabiendic.valida());
	}

	private void testDiaMalNov() {
		assertFalse (diamalnov.valida());
	}

	private void testDiaMal() {
		assertFalse (diamal1.valida());
		assertFalse (diamal2.valida());
	}

	private void testMesMal() {
		assertFalse (mesmal1.valida());
		assertFalse (mesmal2.valida());
	}

	private void testFechaCorrecta() {
		assertTrue (fechaCorrecta.valida());
	}

	
}
