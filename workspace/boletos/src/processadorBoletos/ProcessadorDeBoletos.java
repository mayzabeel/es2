package processadorBoletos;

import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;

public class ProcessadorDeBoletos {
	public ArrayList<Boleto> boletos;
	GregorianCalendar gc = new GregorianCalendar();
	
	public ProcessadorDeBoletos(){
	}
	
	public void criaPagamentos(ArrayList<Boleto> boletos, Fatura fatura){
		Pagamento pagamento;
		for (Boleto boleto : boletos) {
			Date hoje = gc.getTime();
			pagamento = new Pagamento(boleto.valorPago, hoje, fatura, TipoPagamento.BOLETO);
			fatura.pagamentos.add(pagamento);
		} 
		this.verificaEstadoFatura(fatura);
	}

	private void verificaEstadoFatura(Fatura fatura) {
		double valorPago = 0;
		for (Pagamento pagamento : fatura.pagamentos) {
			valorPago += pagamento.getValorPago(); 
		}
		if (fatura.getValorTotal() <= valorPago && fatura.getEstadoFatura().equals(EstadoFatura.NAO_PAGA))
			fatura.setEstadoFatura(EstadoFatura.PAGA);
	}
}
