package ads.poo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    static void main(String[] args) {

//
//        Caixa<String> c = new Caixa<>("Oi");
//        Caixa<Pessoa> d = new Caixa<>(new Pessoa("Rafa", "123"));
//
//        // não precisa de typecasting
//
//        String s = c.getConteudo();
//
//        // erro de compilação, tipos incompatíveis
//
////        String errado = d.getConteudo();
//
//        ArrayList<String> bola = new ArrayList<>();
//
//        HashMap<String, String> cubo = new HashMap<>();

        // Parte 2 da aula, tratamento de exceção

        Scanner ler = new Scanner(System.in);
        int a, b;

        try{
            System.out.println("Entre com o número: ");
            a = ler.nextInt();
            System.out.println("Entre com o número: ");
            b = ler.nextInt();

            int res = a / b;

            System.out.println(a + " dividido por " + b + " = " + res);
        }catch (InputMismatchException e){
            System.err.println("Só é permitido números inteiros");
            ler.nextLine(); // liga o buffer do teclado
        } catch (ArithmeticException e) {
            System.err.println("Não é possível dividir por 0");
            ler.nextLine();
        }
        catch (Exception e) {
            System.err.println("Erro" + e.getMessage());
        }
        System.out.println("Fim do programa");
    }
}
