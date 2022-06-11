package provadois.atividadecinco;

import java.util.Scanner;

public class GerenciaFuncionarios {
    public static void main(String[] args){
        Funcionario[] funcionarios = new Funcionario[5];
        Scanner scanner = new Scanner(System.in);
        UserInterface ui = new UserInterface(scanner);
        ui.exibirInterface(funcionarios);
    }
}
