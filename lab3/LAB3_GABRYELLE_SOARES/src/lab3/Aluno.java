package lab3;

public class Aluno {
	private String matricula;
	private String nome;
	private String curso;
	
	public Aluno(String matricula, String nome, String curso) {
		this.matricula = matricula;
		this.nome = nome;
		this.curso = curso;
	}

	public String getMatricula() {
		return matricula;
	}

	public String getNome() {
		return nome;
	}

	public String getCurso() {
		return curso;
	}

}
