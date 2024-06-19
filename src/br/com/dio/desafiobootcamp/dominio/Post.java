package br.com.dio.desafiobootcamp.dominio;

import java.time.LocalDateTime;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Post {
    private static final double XP_PADRAO = 30d;
    private static int SEQUENCIAL = 1;
    private int id;
    private Dev autor;
    private String titulo;
    private String conteudo;
    private final LocalDateTime dataDaPostagem = LocalDateTime.now();
    private Set<Comentario> comentarios = new LinkedHashSet<>();

    public Post(Dev autor, String titulo, String conteudo) {
        this.id = SEQUENCIAL++;
        this.autor = autor;
        this.titulo = titulo;
        this.conteudo = conteudo;
    }

    public double calcularXp() {
        return XP_PADRAO + comentarios.size() * 5d;
    }

    public int getId() {
        return id;
    }

    public Dev getAutor() {
        return autor;
    }

    public void setAutor(Dev autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public LocalDateTime getDataDaPostagem() {
        return dataDaPostagem;
    }

    public Set<Comentario> getComentarios() {
        return comentarios;
    }

    public void setComentarios(Set<Comentario> comentarios) {
        this.comentarios = comentarios;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Post post = (Post) o;
        return id == post.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
