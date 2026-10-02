package projeto.pessoa;

public class Diretor extends Pessoa {
    private String setor;
    private float salario;

    public void receberAumento(float aum) {
        this.salario += aum;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Diretor [nome=" + getNome() + ", idade=" + getIdade() + ", sexo=" + getSexo() + ", setor=" + setor + ", salario=" + salario + "]";
    }
}
