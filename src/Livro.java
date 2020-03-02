import java.util.ArrayList;
import java.util.List;

public class Livro {
    private String titulo;
    private int anoLancamento;
    private List<Formato> formatos;
    private List<Autor> autores;

    Livro (){
        formatos = new ArrayList<>();
        autores = new ArrayList<>();
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

    public void adicionarAutores(Autor autor){
        this.autores.add(autor);
    }

    public void adicionarFormato(Formato formato){
        this.formatos.add(formato);
    }
}
