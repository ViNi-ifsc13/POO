package ads.poo;

import java.util.ArrayList;

public class App {
    private ArrayList<Conta> contas;


    public App() {
        this.contas = new ArrayList<>();
    }

    void menu(int opcao) {

        while (opcao != 5) {

            String.format("""
                 ..:: Menu ::..
                 1 - Cadastrar conta
                 2 - Listar todas as contas
                 3 - Depositar em uma conta
                 4 - Sacar de uma conta
                 5 - Sair""");
            opcao = Integer.parseInt(IO.readln("Entre com uma opção: "));

            switch (opcao) {


                case 1 -> {
                    var numConta = Integer.parseInt(IO.readln("Entre com o número da conta: "));
                    var nome = IO.readln("Entre com o seu nome: ");
                    var saldo = IO.readln("Entre com o saldo: ");

                    var novaConta = new Conta(numConta, nome, saldo);


                    this.contas.add(novaConta);
                    }


                case 2 -> { contas.forEach(conta -> IO.println(c));{
                    ;
                }

                }

                case 3 -> {}


                case 4 -> {}

                case 5 -> {}

            }
        }
    }

    static void main(String[] args){
        App app = new App();

        // ..:: Menu ::..
        // 1 - Cadastrar conta
        // 2 - Listar todas as contas
        // 3 - Depositar em uma conta
        // 4 - Sacar de uma conta
        // 5 - Sair
        int opcao = Integer.parseInt(IO.readln("Entre com uma opção: "));
        app.menu(1);
    }

}



