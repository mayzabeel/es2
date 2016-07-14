package processadorBoletos;

import java.util.Date;
import java.util.GregorianCalendar;

import junit.framework.TestCase;

public class FaturaTest extends TestCase {
	public void testaConstrutorFatura() {
		GregorianCalendar gc = new GregorianCalendar();
		Date hoje = gc.getTime();
		Fatura fatura = new Fatura("Ana Marcia", hoje, 1000.00, "123456789");
		assertEquals(EstadoFatura.NAO_PAGA , fatura.getEstadoFatura());
		assertTrue(fatura.getPagamentos().isEmpty());	
	}
}
