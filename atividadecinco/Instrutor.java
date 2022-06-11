package provadois.atividadecinco;

public class Instrutor extends Funcionario{
    private String disciplina;
    private int horasMensais;
    private float valorHoraAula;

    public Instrutor(String nome, String mail, String disciplina){
        super(nome, mail);
        setDisciplina(disciplina);
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public void setHorasMensais(int horasMensais) {
        this.horasMensais = horasMensais < 0 ? 0 : horasMensais;
    }

    public void setValorHoraAula(float valorHoraAula) {
        this.valorHoraAula = valorHoraAula < 0 ? 0 : valorHoraAula;
        System.out.println(this.valorHoraAula);
    }

    @Override
    public float pagamento() {
        return this.valorHoraAula * this.horasMensais;
    }

    @Override
    public void exibeDados(){
        super.exibeDados();
        System.out.println("O funcionário " + super.getNome() + " é instrutor da disciplina " + getDisciplina() + ".");
        System.out.println("Trabalhou " + this.horasMensais + " horas e deve receber R$" + this.pagamento() + ".");
    }
}
