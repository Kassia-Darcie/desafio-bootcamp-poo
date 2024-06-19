package br.com.dio.desafiobootcamp.dominio;

import java.time.format.DateTimeFormatter;
import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

public class Forum {
    public static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
    private Set<Post> posts = new LinkedHashSet<>();

    public void criarPost(Dev autor, String titulo, String conteudo) {
        Post post = new Post(autor, titulo, conteudo);
        posts.add(post);
    }

    public void comentarPost(int idPost,Dev autor, String conteudo) {
        Post post = obterPostPeloId(idPost);
        Comentario comentario = new Comentario(autor, conteudo);
        post.getComentarios().add(comentario);
    }

    public Post obterPostPeloId(int id) {
        Optional<Post> post = posts.stream()
                .filter(p -> p.getId() == id)
                .findFirst();
        return post.orElseThrow();
    }

    public Set<Post> getPosts() {
        return posts;
    }

    public void setPosts(Set<Post> posts) {
        this.posts = posts;
    }
}
