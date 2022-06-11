package provadois.atividadecinco;

public abstract class Funcionario {
    protected String nome;
    protected String mail;

    public Funcionario(String nome, String mail) {
        setNome(nome);
        setMail(mail);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    abstract float pagamento();

    public void exibeDados(){
        System.out.println("Dados do funcionário");
        System.out.println("Nome do funcionário: " + getNome());
        System.out.println("Endereço de e-mail do funcionário: " + getMail());
    }
}
