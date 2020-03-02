import java.util.ArrayList;
import java.util.List;

public class Enciclopedia {

    private List<Livro> livros = new ArrayList<>();

    public Enciclopedia() {
        Livro livro0 = new Livro();
        Autor autor0 = new Autor("Chimamanda", "Adichie");
        livro0.adicionarAutores(autor0);
        livro0.setTitulo("Sejamos todos feministas");
        livro0.setAnoLancamento(2014);
        livro0.adicionarFormato(Formato.EBOOK);

        Livro livro1 = new Livro();
        Autor autor1 = new Autor("Alejandro", "Olchik");
        livro1.adicionarAutores(autor1);
        livro1.setTitulo("Manegement 3.0");
        livro1.setAnoLancamento(2017);
        livro1.adicionarFormato(Formato.PDF);
        livro1.adicionarFormato(Formato.FISICO);

        Livro livro2 = new Livro();
        Autor autor2 = new Autor("George", "Owell");
        livro2.adicionarAutores(autor2);
        livro2.setTitulo("1984");
        livro2.setAnoLancamento(1948);
        livro2.adicionarFormato(Formato.PDF);
        livro2.adicionarFormato(Formato.FISICO);
        livro2.adicionarFormato(Formato.EBOOK);

        Livro livro3 = new Livro();
        Autor autor3 = new Autor("Julia", "Naomi");
        livro3.adicionarAutores(autor3);
        livro3.setTitulo("Lean Game Development");
        livro3.setAnoLancamento(2017);
        livro3.adicionarFormato(Formato.PDF);
        livro3.adicionarFormato(Formato.EBOOK);

        Livro livro4 = new Livro();
        Autor autor4 = new Autor("Eduardo", "Galeano");
        livro4.adicionarAutores(autor4);
        livro4.setTitulo("Las venas abiertas de Latinoamerica");
        livro4.setAnoLancamento(1971);
        livro4.adicionarFormato(Formato.FISICO);
        livro4.adicionarFormato(Formato.PDF);
        livro4.adicionarFormato(Formato.EBOOK);

        Livro livro5 = new Livro();
        Autor autor5 = new Autor("Kathy", "Sierra");
        Autor autor51 = new Autor("Elizabeth", "Freeman");
        livro5.adicionarAutores(autor5);
        livro5.adicionarAutores(autor51);
        livro5.setTitulo("Use a cabeça: Padrões de projeto");
        livro5.setAnoLancamento(2004);
        livro5.adicionarFormato(Formato.FISICO);
        livro5.adicionarFormato(Formato.PDF);

        Livro livro6 = new Livro();
        livro6.adicionarAutores(autor0);
        livro6.setTitulo("Americanah");
        livro6.setAnoLancamento(2013);
        livro6.adicionarFormato(Formato.EBOOK);
        livro6.adicionarFormato(Formato.PDF);
        livro6.adicionarFormato(Formato.FISICO);

    }

    public String tituloDoEnesimoLivro(int posicao) {
        return livros.get(posicao).getTitulo();
    }

    public List<Livro> livrosDisponiveisEmPdf() {
        List emPDF = new ArrayList();
        for(Livro livro : livros) {
            if (livro.getFormatos().contains(Formato.PDF)) {
                emPDF.add(livro);
            }
        }
        return emPDF;
    }

    public List<Livro> buscaPorAutora(String nomeCompleto) {
        List porAutora = new ArrayList();
        for (Livro livro : livros) {
            if(livro.getAutores().equals(nomeCompleto)) {
                porAutora.add(livro);
            }
        }
        return porAutora;
    }

    public List<Livro> buscaPorAnoDeLancamento(int ano) {
        List porAnoLancamento = new ArrayList();
        for (Livro livro : livros) {
            if (livro.getAnoLancamento() == ano) {
                porAnoLancamento.add(livro);
            }
        }
        return porAnoLancamento;
    }

    public List<Livro> buscaPorPeriodoDeLancamento(int inicio, int fim) {
        List porPeriodo = new ArrayList();
        for (Livro livro : livros) {
            int ano = livro.getAnoLancamento();
            if (ano >= inicio && ano <= fim){
                porPeriodo.add(livro);
            }
        }
        return porPeriodo;
    }
}
