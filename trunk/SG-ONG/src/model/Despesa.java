package model;

public class Despesa {
	private double valor;
	private String descricao;
	private int mes;
	
	public Despesa(double valor, String descricao, int mes) throws NumberFormatException{
		this.valor = valor;
		this.descricao = descricao;
		this.mes = mes;
		
	}
	
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public String toString(){
		return "Valor: " + valor + " Descrição: " + descricao;
	}
}

