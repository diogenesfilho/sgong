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
	
	
	private ObjectSet listaDeSocios = banco.listaObjeto(Socio.class);
	private ObjectSet listaDePacientes = banco.listaObjeto(Socio.class);
	private ObjectSet listaDeDoacoes = banco.listaObjeto(Doacao.class);
	private ObjectSet listaDeDespesas = banco.listaObjeto(Despesa.class);
	
	public String getQuantidadeSocios() {
		return "Sócios cadastrados: " + listaDeSocios.size();
	}

	public String getQuantidadePacientes() {
		return "Pacientes cadastrados: " + listaDePacientes.size();
	}
	
	public String getQuantidadeDoacoes() {
		return "Doações cadastradas: " + listaDeDoacoes.size();
	}

	public String getQuantidadeDespesas() {
		return "Despesas cadastradas: " + listaDeDespesas.size();
	}
	
	public void compoeDoacoes(){
		ObjectSet doacoes = banco.listaObjeto(Doacao.class);
		
		for (int i = 0; i < doacoes.size(); i++) {
			Doacao d = (Doacao) doacoes.get(i);
			if (d.getMes() == 1) {
				doacoesJan += d.getValor();
			}
			else if (d.getMes() == 2) {
				doacoesFev += d.getValor();
			}
			else if (d.getMes() == 3) {
				doacoesMar += d.getValor();
			}
			else if (d.getMes() == 4) {
				doacoesAbr += d.getValor();
			}
			else if (d.getMes() == 5) {
				doacoesMai += d.getValor();
			}
			else if (d.getMes() == 6) {
				doacoesJun += d.getValor();
			}
			else if (d.getMes() == 7) {
				doacoesJul += d.getValor();
			}
			else if (d.getMes() == 8) {
				doacoesAgo += d.getValor();
			}
			else if (d.getMes() == 9) {
				doacoesSet += d.getValor();
			}
			else if (d.getMes() == 10) {
				doacoesOut += d.getValor();
			}
			else if (d.getMes() == 11) {
				doacoesNov += d.getValor();
			}
			else if (d.getMes() == 12) {
				doacoesDez += d.getValor();
			}
		}
	}

	public void compoeDespesas(){
		ObjectSet despesas = banco.listaObjeto(Despesa.class);
		
		for (int i = 0; i < despesas.size(); i++) {
			Despesa d = (Despesa) despesas.get(i);
			if (d.getMes() == 1) {
				despesasJan += d.getValor();
			}
			else if (d.getMes() == 2) {
				despesasFev += d.getValor();
			}
			else if (d.getMes() == 3) {
				despesasMar += d.getValor();
			}
			else if (d.getMes() == 4) {
				despesasAbr += d.getValor();
			}
			else if (d.getMes() == 5) {
				despesasMai += d.getValor();
			}
			else if (d.getMes() == 6) {
				despesasJun += d.getValor();
			}
			else if (d.getMes() == 7) {
				despesasJul += d.getValor();
			}
			else if (d.getMes() == 8) {
				despesasAgo += d.getValor();
			}
			else if (d.getMes() == 9) {
				despesasSet += d.getValor();
			}
			else if (d.getMes() == 10) {
				despesasOut += d.getValor();
			}
			else if (d.getMes() == 11) {
				despesasNov += d.getValor();
			}
			else if (d.getMes() == 12) {
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