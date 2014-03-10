package model;

import java.util.Date;

import EDU.purdue.cs.bloat.tree.NewExpr;

public class Doacao {
	
	private double valor;
	private String descricao;
	private Date data;
	
	public Doacao(double valor, String descricao, int ano, int mes, int dia) throws NumberFormatException{
		
		this.valor = valor;
		this.descricao = descricao;
		this.data = new Date(ano, mes, dia);
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
	
	
	
	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public String toString(){
		return "Valor: " + valor + " Descrição: " + descricao;
	}

}
