package banco;

import java.lang.reflect.Array;

import com.db4o.ObjectSet;

import model.Despesa;
import model.Doacao;
import model.Paciente;
import model.Socio;
import app.Main;

public class InfoBD {

	private Banco banco = Main.getBanco();
	
	private float doacoesJan, doacoesFev, doacoesMar, doacoesAbr, doacoesMai, doacoesJun, doacoesJul, doacoesAgo, doacoesSet, doacoesOut, doacoesNov, doacoesDez = 0;
	private float despesasJan, despesasFev, despesasMar, despesasAbr, despesasMai, despesasJun, despesasJul, despesasAgo, despesasSet, despesasOut, despesasNov, despesasDez = 0;
	private float arrecadacoes, gastos, saldo = 0;
	
	
	private ObjectSet listaDeSocios = banco.listaObjeto(Socio.class);
	private ObjectSet listaDePacientes = banco.listaObjeto(Paciente.class);
	private ObjectSet listaDeDoacoes = banco.listaObjeto(Doacao.class);
	private ObjectSet listaDeDespesas = banco.listaObjeto(Despesa.class);
	
	public int getQuantidadeSocios() {
		return listaDeSocios.size();
	}

	public int getQuantidadePacientes() {
		return listaDePacientes.size();
	}
	
	public int getQuantidadeDoacoes() {
		return listaDeDoacoes.size();
	}

	public int getQuantidadeDespesas() {
		return listaDeDespesas.size();
	}
	
	public float geraArrecadacoes(){
		arrecadacoes = doacoesJan + doacoesFev + doacoesMar + doacoesAbr +
				doacoesMai + doacoesJun + doacoesJul + doacoesAgo +
				doacoesSet + doacoesOut + doacoesNov + doacoesDez;
		return arrecadacoes;
	}
	
	public float geraGastos(){
		gastos = despesasJan + despesasFev + despesasMar + despesasAbr +
				despesasMai + despesasJun + despesasJul + despesasAgo +
				despesasSet + despesasOut + despesasNov + despesasDez;
		return gastos;
	}	
	
	public float geraSaldo(){
		saldo = arrecadacoes - gastos;
		return saldo;
	}

	public void compoeDoacoes(){
		ObjectSet doacoes = banco.listaObjeto(Doacao.class);
		
		for (int i = 0; i < doacoes.size(); i++) {
			Doacao d = (Doacao) doacoes.get(i);
			if (d.getMes().equals("Janeiro")) {
				doacoesJan += d.getValor();
			}
			else if (d.getMes().equals("Fevereiro")) {
				doacoesFev += d.getValor();
			}
			else if (d.getMes().equals("Março")) {
				doacoesMar += d.getValor();
			}
			else if (d.getMes().equals("Abril")) {
				doacoesAbr += d.getValor();
			}
			else if (d.getMes().equals("Maio")) {
				doacoesMai += d.getValor();
			}
			else if (d.getMes().equals("Junho")) {
				doacoesJun += d.getValor();
			}
			else if (d.getMes().equals("Julho")) {
				doacoesJul += d.getValor();
			}
			else if (d.getMes().equals("Agosto")) {
				doacoesAgo += d.getValor();
			}
			else if (d.getMes().equals("Setembro")) {
				doacoesSet += d.getValor();
			}
			else if (d.getMes().equals("Outubro")) {
				doacoesOut += d.getValor();
			}
			else if (d.getMes().equals("Novembro")) {
				doacoesNov += d.getValor();
			}
			else if (d.getMes().equals("Dezembro")) {
				doacoesDez += d.getValor();
			}
		}
	}

	public void compoeDespesas(){
		ObjectSet despesas = banco.listaObjeto(Despesa.class);
		
		for (int i = 0; i < despesas.size(); i++) {
			Despesa d = (Despesa) despesas.get(i);
			if (d.getMes().equals("Janeiro")) {
				despesasJan += d.getValor();
			}
			else if (d.getMes().equals("Fevereiro")) {
				despesasFev += d.getValor();
			}
			else if (d.getMes().equals("Março")) {
				despesasMar += d.getValor();
			}
			else if (d.getMes().equals("Abril")) {
				despesasAbr += d.getValor();
			}
			else if (d.getMes().equals("Maio")) {
				despesasMai += d.getValor();
			}
			else if (d.getMes().equals("Junho")) {
				despesasJun += d.getValor();
			}
			else if (d.getMes().equals("Julho")) {
				despesasJul += d.getValor();
			}
			else if (d.getMes().equals("Agosto")) {
				despesasAgo += d.getValor();
			}
			else if (d.getMes().equals("Setembro")) {
				despesasSet += d.getValor();
			}
			else if (d.getMes().equals("Outubro")) {
				despesasOut += d.getValor();
			}
			else if (d.getMes().equals("Novembro")) {
				despesasNov += d.getValor();
			}
			else if (d.getMes().equals("Dezembro")) {
				despesasDez += d.getValor();
			}
		}
	}

	public float getDoacoesJan() {
		return doacoesJan;
	}

	public float getDoacoesFev() {
		return doacoesFev;
	}

	public float getDoacoesMar() {
		return doacoesMar;
	}

	public float getDoacoesAbr() {
		return doacoesAbr;
	}

	public float getDoacoesMai() {
		return doacoesMai;
	}

	public float getDoacoesJun() {
		return doacoesJun;
	}

	public float getDoacoesJul() {
		return doacoesJul;
	}

	public float getDoacoesAgo() {
		return doacoesAgo;
	}

	public float getDoacoesSet() {
		return doacoesSet;
	}

	public float getDoacoesOut() {
		return doacoesOut;
	}

	public float getDoacoesNov() {
		return doacoesNov;
	}

	public float getDoacoesDez() {
		return doacoesDez;
	}

	public float getDespesasJan() {
		return despesasJan;
	}

	public float getDespesasFev() {
		return despesasFev;
	}

	public float getDespesasMar() {
		return despesasMar;
	}

	public float getDespesasAbr() {
		return despesasAbr;
	}

	public float getDespesasMai() {
		return despesasMai;
	}

	public float getDespesasJun() {
		return despesasJun;
	}

	public float getDespesasJul() {
		return despesasJul;
	}

	public float getDespesasAgo() {
		return despesasAgo;
	}

	public float getDespesasSet() {
		return despesasSet;
	}

	public float getDespesasOut() {
		return despesasOut;
	}

	public float getDespesasNov() {
		return despesasNov;
	}

	public float getDespesasDez() {
		return despesasDez;
	}

}