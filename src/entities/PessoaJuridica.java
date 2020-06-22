package entities;

public class PessoaJuridica extends Contribuinte {

	protected Integer nFuncionarios;

	public PessoaJuridica(String nome, Double renda, Integer nFuncionarios) {
		super(nome, renda);
		this.nFuncionarios = nFuncionarios;
	}

	public Integer getnFuncionarios() {
		return nFuncionarios;
	}

	public void setnFuncionarios(Integer nFuncionarios) {
		this.nFuncionarios = nFuncionarios;
	}

	@Override
	public double impostoPago() {
		if (nFuncionarios <= 10) {
			return renda * 0.16;
		}
		else {
			return renda * 0.14;
		}
	}	
}
