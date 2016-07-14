package processadorBoletos;

import java.util.ArrayList;
import java.util.Date;

public class Fatura {
	protected String nomeCliente;
	protected Date data;
	protected double valorTotal;
	public EstadoFatura estadoFatura;
	public String codigoFatura;
	public ArrayList<Pagamento> pagamentos;
	
	public Fatura(String nomeCliente, Date data, double valorTotal, String codigoFatura){
		this.nomeCliente = nomeCliente;
		this.data = data;
		this.valorTotal = valorTotal;
		this.estadoFatura = EstadoFatura.NAO_PAGA;
		this.codigoFatura = codigoFatura;
		this.pagamentos = new ArrayList<Pagamento>();
	}
	
	public EstadoFatura getEstadoFatura() {
		return estadoFatura;
	}
	public void setEstadoFatura(EstadoFatura estadoFatura) {
		this.estadoFatura = estadoFatura;
	}
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public double getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public String getCodigoFatura() {
		return codigoFatura;
	}

	public void setCodigoFatura(String codigoFatura) {
		this.codigoFatura = codigoFatura;
	}

	public ArrayList<Pagamento> getPagamentos() {
		return pagamentos;
	}

	public void setPagamentos(ArrayList<Pagamento> pagamentos) {
		this.pagamentos = pagamentos;
	}	
}
