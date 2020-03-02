import java.util.ArrayList;

public class Livro {
    ArrayList<Formato> formatos = new ArrayList<>();
    ArrayList<Autor> autores = new ArrayList<>();

    Livro (ArrayList<Formato> formatos, ArrayList<Autor> autores){
        this.formatos = formatos;
        this.autores = autores;
    }
}
