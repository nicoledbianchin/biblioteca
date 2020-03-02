import java.util.ArrayList;
import java.util.List;

public class Livro {
    private List<Formato> formatos;
    private List<Autor> autores;
    private int anoLancamento;
    private String titulo;

    Livro (List<Formato> formatos, List<Autor> autores){
        this.formatos = formatos;
        this.autores = autores;
    }

    public List<Formato> getFormatos() {
        return formatos;
    }

    public List<Autor> getAutores() {
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
