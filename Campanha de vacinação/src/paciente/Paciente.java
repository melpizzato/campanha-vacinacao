package paciente;

public class Paciente implements Comparable<Paciente>{
	
	private int idade;
	private String nome;
	
	public Paciente(String nome, int idade) {
		this.idade = idade;
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	@Override
	public int compareTo(Paciente outroPaciente) {
		if(this.idade > outroPaciente.getIdade()) {
			return -1;
		}
		if(this.idade < outroPaciente.getIdade()) {
			return 1;
		}
		return 0;
	}

	@Override
	public String toString() {
		return this.nome + " - " + this.idade + " anos";
	}
	
	

}
