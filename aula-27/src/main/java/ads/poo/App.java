package ads.poo;

public class App {
    static void main() {
        Usuario u = new Usuario("claudio","123");
        Livro l1 = new Livro(13,"a","a","1",true,false);
        Livro l2 = new Livro(13,"a","a","2",false,false);
        Livro l3 = new Livro(13,"a","a","3",false,false);

        Biblioteca b = new Biblioteca();


        try{
            b.emprestarLivro("1","123");

        } catch (EmprestimoEmprestadoException e){
            System.out.println("Erro: " + e.getMessage());

        } catch (LimiteEmprestimosException l) {
            System.out.println("Erro " + l.getMessage());
        }



    }
}
