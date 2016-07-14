package processadorBoletos;

import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;

import junit.framework.TestCase;

public class ProcessadorDeBoletosTest extends TestCase {
	GregorianCalendar gc = new GregorianCalendar();
	Date hoje = gc.getTime();
	Fatura fatura = new Fatura("Ana Cristina", hoje, 5000.00, "987654321");
	Boleto boleto1 = new Boleto("123456", hoje, 2000.00);
	Boleto boleto2 = new Boleto("123456", hoje, 3000.00);
	ArrayList<Boleto> boletos = new ArrayList<Boleto>();
	
	ProcessadorDeBoletos processador = new ProcessadorDeBoletos();
	
	public void testarGerarPagamentos(){
		boletos.add(boleto1);
		boletos.add(boleto2);
		assertEquals(fatura.getEstadoFatura(), EstadoFatura.NAO_PAGA);
		processador.criaPagamentos(boletos, fatura);
		assertEquals(fatura.getEstadoFatura(), EstadoFatura.PAGA);
		assertFalse(fatura.getPagamentos().isEmpty());
		assertEquals(2, fatura.getPagamentos().size());
	}		
}
