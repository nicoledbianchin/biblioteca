import java.util.ArrayList;

public class Livro {
    private ArrayList<Formato> formatos = new ArrayList<>();
    private ArrayList<Autor> autores = new ArrayList<>();
    int anoLancamento;
    String titulo;

    Livro (ArrayList<Formato> formatos, ArrayList<Autor> autores){
        this.formatos = formatos;
        this.autores = autores;
    }

    public ArrayList<Formato> getFormatos() {
        return formatos;
    }

    public ArrayList<Autor> getAutores() {
        return autores;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
