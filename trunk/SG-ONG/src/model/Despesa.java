package model;

public class Despesa {
	private double valor;
	private String descricao;
	
	public Despesa(double valor, String descricao){
		this.valor = valor;
		this.descricao = descricao;
		
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
	
	public String toString(){
		return "Valor: " + valor + " Descrição: " + descricao;
	}
}

