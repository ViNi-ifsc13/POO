package ads.poo;

import java.util.ArrayList;

public class App {
    private ArrayList<Conta> contas;


    public App() {
        this.contas = new ArrayList<>();
    }

    void cadastrar(){
        var numConta = IO.readln("Entre com o número da conta: ");
        var nome = IO.readln("Entre com o seu nome: ");
        var saldo = Integer.parseInt(IO.readln("Entre com o seu saldo: "));

        var novaConta = new Conta(saldo, nome, numConta);


        this.contas.add(novaConta);
    }

    void listarContas(){
            for (Conta elemento : contas){
                IO.println(elemento.toString());
            }

//            Esse é o lambda
//        contas.forEach(elemento -> IO.println(elemento));

//        Esse é um modo de referenciar em caso de ter apenas um parametro, igual o "elemento" em cima
//        contas.forEach(IO::println);
    }

    void depositarConta(){
        var numeroConta = IO.readln("Entre com a conta que deseja depositar: ");
        var valorDeposito = Integer.parseInt(IO.readln("Entre com o valor que deseja depositar: "));

        for (Conta numConta : contas){
            if (numConta.getNumConta().equals(numeroConta)){
                var saldoAnterior = numConta.getSaldo();
                numConta.depositar(valorDeposito);
                if (saldoAnterior == numConta.getSaldo()){
                    IO.println("Não foi possível depositar");
                }
                return;
            }

        }
        IO.println("Número de conta não encontrada.");
    }

    void sacarConta () {
        var numeroConta = IO.readln("Entre com a conta que deseja sacar: ");
        var valorSaque = Integer.parseInt(IO.readln("Entre com o valor que deseja sacar: "));

        for (Conta numConta : contas) {
            if (numConta.getNumConta().equals(numeroConta)) {
                numConta.sacar(valorSaque);
                return;
            }


        }
        IO.println("Número de conta não encontrada.");
    }


    void menu (int opcao) {

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


                case 1 -> { cadastrar();}


                case 2 -> { listarContas();}

                case 3 -> { depositarConta();}

                case 4 -> { sacarConta();}

                case 5 -> { }

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
        app.menu(opcao);
    }

}



