package processadorBoletos;

import java.util.Date;

public class Pagamento {
	protected double valorPago;
	protected Date data;
	protected Fatura fatura;
	protected TipoPagamento tipo;
	
	public Pagamento(double valorPago, Date data,Fatura fatura, TipoPagamento tipo ){
		this.valorPago = valorPago;
		this.data = data;
		this.fatura = fatura;
		this.tipo = tipo;	
	}
	
	public double getValorPago() {
		return valorPago;
	}
	public void setValorPago(double valorPago) {
		this.valorPago = valorPago;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public TipoPagamento getTipo() {
		return tipo;
	}
	public void setTipo(TipoPagamento tipo) {
		this.tipo = tipo;
	}
	}
