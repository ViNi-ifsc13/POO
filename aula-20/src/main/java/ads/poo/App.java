package ads.poo;

public class App {

    static void main() {

        App agenda = new App();

        int opcao = Integer.parseInt(IO.readln("Entre com uma opção: "));
        agenda.menu(opcao);

    }

     void menu(int opcao) {

        while (opcao != 10) {

            String.format("""
                    ..:: Agenda ::..
                    1 - Adicionar contato
                    2 - Encontrar contato
                    3 - Remover contato
                    4 - Adicionar telefone
                    5 - Adicionar email
                    6 - Atualizar telefone
                    7 - Atualizar email
                    8 - Remover telefone
                    9 - Remover email
                    10 - Fechar agenda""");
            opcao = Integer.parseInt(IO.readln("Entre com uma opção: "));

        }

    }

}
