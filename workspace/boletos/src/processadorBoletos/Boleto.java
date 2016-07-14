package processadorBoletos;

import java.util.Date;

public class Boleto {
	protected String codigo;
	protected Date data;
	protected double valorPago;
	
	public Boleto(String codigo, Date data, double valorPago) {
		this.codigo = codigo;
		this.data = data;
		this.valorPago = valorPago;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public double getValorPago() {
		return valorPago;
	}

	public void setValorPago(double valorPago) {
		this.valorPago = valorPago;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	public String getCodigo() {
		return codigo;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (! (obj instanceof Boleto)) {
			return false;
		}
		Boleto outroBoleto = (Boleto) obj;
		return this.getCodigo().equals(outroBoleto.getCodigo());
	}

}
