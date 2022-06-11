package provadois.atividadecinco;

import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;

    public UserInterface(Scanner scanner) {
        this.scanner = scanner;
    }

    public void exibirInterface(Funcionario[] funcionarios) {
        informarFuncionarios(funcionarios);
        exibirFuncionarios(funcionarios);
    }

    private void exibirFuncionarios(Funcionario[] funcionarios) {
        System.out.println("======Inicio da impressão das informações dos funcionários=======");
        for (Funcionario funcionario : funcionarios) {
            System.out.println();
            funcionario.exibeDados();
            System.out.println();
        }
        System.out.println("======Termino da impressão das informações dos funcionários======");
    }

    private void informarFuncionarios(Funcionario[] funcionarios) {
        int opcao, salario, horas;
        String nome, mail, linguagem;
        System.out.println("======Inicio do preencimento das informações dos funcionários=======");
        for (int i = 0; i < funcionarios.length; i++){
            opcao = validarEntrada(i);
            scanner.nextLine();
            switch (opcao) {
                case 1->
                    System.out.println("Informe o nome do funcionário: ");
                    nome = scanner.nextLine();

                    System.out.println("Informe o e-mail do funcionário: ");
                    mail = scanner.nextLine();

                    System.out.println("Informe a linguagem de especialização do programador: ");
                    linguagem = scanner.nextLine();
                    funcionarios[i] = new Programador(nome, mail, linguagem);

                    System.out.println("Informe o salario do programador:");
                    salario = scanner.nextInt();
                    if(funcionarios[i] instanceof Programador){
                        ((Programador) funcionarios[i]).setSalarioMensal(salario);
                    }

                case 2->
                    System.out.println("Informe o nome do funcionário: ");
                    nome = scanner.nextLine();

                    System.out.println("Informe o e-mail do funcionário: ");
                    mail = scanner.nextLine();

                    System.out.println("Informe a disciplina do instrutor: ");
                    linguagem = scanner.nextLine();
                    funcionarios[i] = new Instrutor(nome, mail, linguagem);

                    System.out.println("Informe o valor/hora do instrutor:");
                    salario = scanner.nextInt();
                    System.out.println("Informe o numero de horas trabalhadas do instrutor:");
                    horas = scanner.nextInt();
                    if(funcionarios[i] instanceof Instrutor){
                        ((Instrutor) funcionarios[i]).setValorHoraAula(salario);
                        ((Instrutor) funcionarios[i]).setHorasMensais(horas);
                    }
                
            }
        }
        System.out.println("======Termino do preencimento das informações dos funcionários======");
    }

    private int validarEntrada(int i) {
        int entrada = 0;
        do {
            System.out.println("Informe a categoria do " + (i + 1) + "o funcionário\n1-Programador\n2-Instrutor");
            entrada = scanner.nextInt();
        } while (entrada != 1 && entrada != 2);

        return entrada;
    }
}
