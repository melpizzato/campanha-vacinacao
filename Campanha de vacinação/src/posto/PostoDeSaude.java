package posto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import paciente.Paciente;

public class PostoDeSaude {
	
	private List<Paciente> pacientes;
	private List<Paciente> pacientesVacinados;
	private int quantidadeVacinas;
	private int quantidadePacientesVacinados;
	
	public PostoDeSaude(int quantidadeVacinas){
		this.pacientes = new ArrayList<>();
		this.pacientesVacinados = new ArrayList<>();
		this.quantidadeVacinas = quantidadeVacinas;
	}
	
	
	
	public List<Paciente> getPacientes() {
		return pacientes;
	}

	

	public List<Paciente> getPacientesVacinados() {
		return pacientesVacinados;
	}



	public int getQuantidadePacientesVacinados() {
		return quantidadePacientesVacinados;
	}


	public void inserirPaciente(Paciente p) {
		this.pacientes.add(p);
	}
	
	public void ordenarPacientesPorIdade() {
		Collections.sort(pacientes);
	}
	
	public void receberVacinas(int quantidade) {
		this.quantidadeVacinas += quantidade;
	}
	
	public void vacinar() {
		this.pacientes.removeAll(Collections.singleton(null));
		this.ordenarPacientesPorIdade();
		
		if(quantidadeVacinas > this.pacientes.size()) {
			for(int i = 0; i < this.pacientes.size(); i++) {
				this.pacientesVacinados.add(this.pacientes.get(i));
				this.pacientes.set(i, null);
				this.quantidadePacientesVacinados++;
			}
		}
		else {
			for(int i = 0; i < quantidadeVacinas; i++) {
				this.pacientesVacinados.add(this.pacientes.get(i));
				this.pacientes.set(i, null);
				this.quantidadePacientesVacinados++;
			}
		}
	}

}
