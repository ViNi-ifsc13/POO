package ads.poo;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        //TODO terminar isso ai
        int dia = Integer.parseInt(IO.readln("Entre com o dia:"));
        String mes = (IO.readln("Entre com o mês:"));


        String estacao = "";

        if (dia > 20 && mes.equals("março") || mes.equals("abril") || mes.equals("maio") || dia < 21 && mes.equals("junho"))
            estacao = "Outono";
        else if (dia > 20 && mes.equals("junho") || mes.equals("julho") || mes.equals("agosto") || dia < 23 && mes.equals("setembro"))
            estacao = "Inverno";
        else if (dia > 22 && mes.equals("setembro") || mes.equals("outubro") || mes.equals("novemnro") || dia < 21 && mes.equals("dezembro"))
            estacao = "Primavera";
        else if (dia > 20 && mes.equals("dezembro") || mes.equals("janeiro") || mes.equals("fevereiro") || dia < 21 && mes.equals("março"))
            estacao = "Verão";
        else {
            System.out.println("Erro");
        }

        IO.println("A estação é: " + estacao);


    }
}
