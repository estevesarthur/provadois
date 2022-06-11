package provadois.atividadecinco;

public class Programador extends Funcionario{
    private String linguagem;
    private float salarioMensal;

    public Programador(String nome, String mail, String linguagem){
        super(nome, mail);
        setLinguagem(linguagem);
    }

    public String getLinguagem() {
        return linguagem;
    }

    public void setLinguagem(String linguagem) {
        this.linguagem = linguagem;
    }

    public void setSalarioMensal(float salarioMensal) {
        this.salarioMensal = (salarioMensal < 0) ? 0 : salarioMensal;
    }

    @Override
    public float pagamento() {
        return this.salarioMensal;
    }

    @Override
    public void exibeDados(){
        super.exibeDados();
        System.out.println("O programador " + super.getNome() + " trabalha com a linguagem "
                + getLinguagem() + ".");
        System.out.println("O salário do é de R$" + this.pagamento() + ".");
    }
}
