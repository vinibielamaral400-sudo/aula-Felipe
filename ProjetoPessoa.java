package projeto.pessoa;

import javax.swing.JOptionPane;

public class ProjetoPessoa {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa();
		Aluno p2 = new Aluno();
		Pofessor p3 = new Pofessor();
		Funcionario p4 = new Funcionario();
		Diretor p5 = new Diretor();

		p1.setNome("Pedro 'teste' ");
		p1.setIdade(40);
		p1.setSexo("Masculino");

		p2.setNome("Maria");
		p2.setIdade(25);
		p2.setSexo("Feminino");

		p3.setNome("Claudio");
		p3.setIdade(35);
		p3.setSexo("Masculino");
		p3.setEspecialidade("Matemática");
		p3.setSalario(4500.0f);

		p4.setNome("Fabiana");
		p4.setIdade(30);
		p4.setSexo("Feminino");
		p4.setSetor("Recepção");
		p4.setTrabalhando(true);

		p5.setNome("Carlos");
		p5.setIdade(50);
		p5.setSexo("Masculino");
		p5.setSetor("Administração");
		p5.setSalario(12000.0f);

		JOptionPane.showMessageDialog(null,
			p1.toString() + "\n" +
			p3.toString() + "\n" +
			p4.toString() + "\n" +
			p2.toString() + "\n" +
			p5.toString() + "\n");

		JOptionPane.showMessageDialog(null, "Idade do aluno: " + p2.getIdade());
	}

}
