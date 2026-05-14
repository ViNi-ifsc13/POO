package ads.poo;

import ads.poo.produtos.Dimensao;
import ads.poo.produtos.Semfio;
import ads.poo.produtos.Telefone;

public class App {

    static void main() {


        Dimensao dim = new Dimensao(5,5,5);
        Telefone tel = new Telefone(50,"3f","nokia",5,dim);
        Semfio telSem = new Semfio(55,"5f","nokia",5,dim,300,5,6);

        IO.println(tel);
        IO.println(telSem);


    }
}
