package br.com.dio.desafiobootcamp.dominio;

import java.time.LocalDateTime;
import java.util.Objects;

public class Comentario {
    private Dev autor;
    private final LocalDateTime dataPublicacao = LocalDateTime.now();
    private String conteudo;

    public Comentario(Dev autor, String conteudo) {
        this.autor = autor;
        this.conteudo = conteudo;
    }

    public Dev getAutor() {
        return autor;
    }

    public void setAutor(Dev autor) {
        this.autor = autor;
    }

    public LocalDateTime getDataPublicacao() {
        return dataPublicacao;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Comentario that = (Comentario) o;
        return Objects.equals(getAutor(), that.getAutor()) && Objects.equals(getDataPublicacao(), that.getDataPublicacao()) && Objects.equals(getConteudo(), that.getConteudo());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAutor(), getDataPublicacao(), getConteudo());
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Autor: ");
        sb.append(autor.getNome());
        sb.append(", publicado em: ").append(dataPublicacao.format(Forum.formatter)).append("\n");
        sb.append("Conteúdo= ").append(conteudo).append("\n");
        return sb.toString();
    }
}
