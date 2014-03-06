package model;

public class Doacao {
	private double valor;
	private String descricao;
	
	public Doacao(double valor, String descricao){
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
