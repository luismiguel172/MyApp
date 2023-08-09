package br.com.etecia.myapp;

public class Filmes {

    private String Titulo;
    private String Categoria;
    private String Descrição;

    public Filmes(String titulo, String categoria, String descrição, int imagem) {
        Titulo = titulo;
        Categoria = categoria;
        Descrição = descrição;
        this.imagem = imagem;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String categoria) {
        Categoria = categoria;
    }

    public String getDescrição() {
        return Descrição;
    }

    public void setDescrição(String descrição) {
        Descrição = descrição;
    }

    public int getImagem() {
        return imagem;
    }

    public void setImagem(int imagem) {
        this.imagem = imagem;
    }

    private int imagem;

}

