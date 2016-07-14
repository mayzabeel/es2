package processadorBoletos;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import junit.framework.TestCase;

public class BoletoTest extends TestCase {
	public void testBoleto() {
		GregorianCalendar gc = new GregorianCalendar();
		Boleto boleto = new Boleto("123456", gc.getTime() , 10.90);	
	}
	
	public void testGetCodigo() {
		GregorianCalendar gc = new GregorianCalendar();
		String codigo = "123456";
		Boleto boleto = new Boleto(codigo, gc.getTime() , 10.90);

		assertEquals("Deveriam ser iguais", codigo , boleto.getCodigo());
	}
	
	public void testSetCodigo() {
		GregorianCalendar gc = new GregorianCalendar();
		String codigo = "123456";
		Boleto boleto = new Boleto(codigo, gc.getTime() , 10.90);
		assertEquals("Deveriam ser iguais", codigo , boleto.getCodigo());
		String codigoNovo = "654321";
		boleto.setCodigo(codigoNovo);
		assertNotSame("Deveriam ser diferentes", codigo , boleto.getCodigo());
		assertEquals("Deveriam ser iguais", codigoNovo , boleto.getCodigo());	
	}
	
	public void testGetData() {
		GregorianCalendar gc = new GregorianCalendar();
		Date hoje = gc.getTime();
		Boleto boleto = new Boleto("123456", hoje , 10.90);

		assertEquals("Deveriam ser iguais", hoje, boleto.getData());
	}
	
	public void testSetData() {
		GregorianCalendar gc = new GregorianCalendar();
		Date hoje = gc.getTime();
		gc.add(Calendar.DATE, -1);
		Date ontem = gc.getTime();
		Boleto boleto = new Boleto("123456", hoje , 10.90);
		assertEquals("Deveriam ser iguais",hoje, boleto.getData());
		boleto.setData(ontem);
		assertNotSame("Deveriam ser diferentes", hoje, boleto.getData());
		assertEquals("Deveriam ser iguais", ontem , boleto.getData());	
	}
	
	public void testGetValorPago() {
		GregorianCalendar gc = new GregorianCalendar();
		Date hoje = gc.getTime();
		double valor = 10.90;
		Boleto boleto = new Boleto("123456", hoje , valor);

		assertEquals("Deveriam ser iguais", valor, boleto.getValorPago());
	}
	
	public void testSetValorPago() {
		GregorianCalendar gc = new GregorianCalendar();
		Date hoje = gc.getTime();
		double valorAntigo = 10.90;
		Boleto boleto = new Boleto("123456", hoje , 10.90);
		assertEquals("Deveriam ser iguais",valorAntigo, boleto.getValorPago());
		double valorNovo = 100.90;
		boleto.setValorPago(valorNovo);
		assertNotSame("Deveriam ser diferentes", valorAntigo, boleto.getValorPago());
		assertEquals("Deveriam ser iguais", valorNovo , boleto.getValorPago());	
	}
	
	public void testEquals() {
		GregorianCalendar gc = new GregorianCalendar();
		Boleto boleto = new Boleto("123456", gc.getTime() , 10.90);
		Boleto outroBoleto = new Boleto("123456", gc.getTime() , 10.90);
		assertTrue("Deveriam ser iguais", boleto.equals(outroBoleto));
		
		boleto.setValorPago(59.90);
		assertTrue("Deveriam ser iguais", boleto.equals(outroBoleto));
		
		boleto.setCodigo("654321");
		assertFalse("Deveriam ser diferentes", boleto.equals(outroBoleto));
	}
}
