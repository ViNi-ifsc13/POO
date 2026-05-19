package ads.poo;

import ads.poo.produtos.Dimensao;
import ads.poo.produtos.Semfio;
import ads.poo.produtos.Telefone;

public class App {

    static void main() {


        Dimensao dim = new Dimensao(5,5,5);
        Telefone tel = new Telefone(50,"3f","nokia",5,dim);
        Semfio telSem = new Semfio(55,"5f","nokia",5,dim,300,5,6);
        Telefone a  = new Semfio(13,"7f","nokia",5,dim,300,13,20);

        Telefone[] vetor = new Telefone[3];

        vetor[0] = tel;
        vetor[1] = telSem;
        vetor[2] = a;


        for (Telefone aux : vetor){
            if (aux instanceof Semfio novo){ // Semfio novo = (Semfio) aux;

                IO.println(novo.getFrequencia());
            }
        }


        IO.println(tel);
        IO.println(telSem);

        telSem.getFrequencia();
        ((Semfio)a).getFrequencia();

        Semfio outra = (Semfio) a;
        outra.getFrequencia();


    }
}
