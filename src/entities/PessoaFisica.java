package entities;

public class PessoaFisica extends Contribuinte {

	private Double gastosSaude;

	public PessoaFisica(String nome, Double renda, Double gastosSaude) {
		super(nome, renda);
		this.gastosSaude = gastosSaude;
	}

	public Double getGastosSaude() {
		return gastosSaude;
	}

	public void setGastosSaude(Double gastosSaude) {
		this.gastosSaude = gastosSaude;
	}
	
	@Override
	public double impostoPago() {
		if (renda < 20000.00) {
			return renda * 0.15 - gastosSaude * 0.5;
		}
		else {
			return renda * 0.25 - gastosSaude * 0.5;
		}
	}
}
