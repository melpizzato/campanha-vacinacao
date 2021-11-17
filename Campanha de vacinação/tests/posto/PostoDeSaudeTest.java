package posto;

import org.junit.Test;

import paciente.Paciente;

public class PostoDeSaudeTest {
	
	//@Test
	public void ordenaCorretamenteAListaDePacientesPorIdade() {
		PostoDeSaude posto = new PostoDeSaude(10);
		Paciente p1 = new Paciente("Joana", 25);
		Paciente p2 = new Paciente("Beatriz", 60);
		Paciente p3 = new Paciente("Paulo", 76);
		Paciente p4 = new Paciente("João", 43);
		Paciente p5 = new Paciente("Isabela", 15);
		
		posto.inserirPaciente(p1);
		posto.inserirPaciente(p2);
		posto.inserirPaciente(p3);
		posto.inserirPaciente(p4);
		posto.inserirPaciente(p5);
		
		posto.ordenarPacientesPorIdade();
		
		System.out.println(posto.getPacientes());
	}
	
	//@Test
	public void vacinaTodosOsPacientesQuandoHaVacinaSuficiente() {
		PostoDeSaude posto = new PostoDeSaude(10);
		Paciente p1 = new Paciente("Joana", 25);
		Paciente p2 = new Paciente("Beatriz", 60);
		Paciente p3 = new Paciente("Paulo", 76);
		Paciente p4 = new Paciente("João", 43);
		Paciente p5 = new Paciente("Isabela", 15);
		
		posto.inserirPaciente(p1);
		posto.inserirPaciente(p2);
		posto.inserirPaciente(p3);
		posto.inserirPaciente(p4);
		posto.inserirPaciente(p5);
		
		posto.vacinar();
		
		System.out.println(posto.getPacientesVacinados());
	}
	
	//@Test
	public void vacinaApenasPacientesMaisVelhosQuandoNaoHaVacinaSuficiente() {
		PostoDeSaude posto = new PostoDeSaude(3);
		Paciente p1 = new Paciente("Joana", 25);
		Paciente p2 = new Paciente("Beatriz", 60);
		Paciente p3 = new Paciente("Paulo", 76);
		Paciente p4 = new Paciente("João", 43);
		Paciente p5 = new Paciente("Isabela", 15);
		
		posto.inserirPaciente(p1);
		posto.inserirPaciente(p2);
		posto.inserirPaciente(p3);
		posto.inserirPaciente(p4);
		posto.inserirPaciente(p5);
		
		posto.vacinar();
		
		System.out.println(posto.getPacientesVacinados());
		
	}
	
	@Test
	public void vacinaTodosOsPacientesQuandoChegamMaisVacinas() {
		PostoDeSaude posto = new PostoDeSaude(3);
		Paciente p1 = new Paciente("Joana", 25);
		Paciente p2 = new Paciente("Beatriz", 60);
		Paciente p3 = new Paciente("Paulo", 76);
		Paciente p4 = new Paciente("João", 43);
		Paciente p5 = new Paciente("Isabela", 15);
		
		posto.inserirPaciente(p1);
		posto.inserirPaciente(p2);
		posto.inserirPaciente(p3);
		posto.inserirPaciente(p4);
		posto.inserirPaciente(p5);
		
		posto.vacinar();
		
		posto.receberVacinas(10);
		
		posto.vacinar();
		
		System.out.println(posto.getPacientesVacinados());
		
	}

}
