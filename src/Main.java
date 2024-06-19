import br.com.dio.desafiobootcamp.dominio.*;

import java.sql.Array;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso("Curso Java", "Descrição do curso de Java", 15);
        Curso curso2 = new Curso("Curso Javascript", "Descrição do curso de Java", 14);
        Curso curso3 = new Curso("Curso Html", "Descrição do curso de html", 8);
        Mentoria mentoria = new Mentoria("Java na prática", "descrição mentoria", LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java");
        bootcamp.setDescricao("Descrição do Bootcamp Java");
        bootcamp.getConteudos().addAll(Arrays.asList(curso1, curso2, mentoria, curso3));
        bootcamp.setForum(new Forum());

        Dev devKassia = new Dev("kassia");
        devKassia.inscreverBootcamp(bootcamp);
        devKassia.progredir();
        devKassia.progredir();
        devKassia.progredir();
        bootcamp.getForum().criarPost(devKassia, "Post de Kassia", "Conteudo do post de Kassia");

        Dev devJoao = new Dev("João");
        devJoao.inscreverBootcamp(bootcamp);
        devJoao.progredir();
        bootcamp.getForum().comentarPost(1, devJoao, "Muito legal essa dica");

        Dev devMaria = new Dev("Maria");
        devMaria.inscreverBootcamp(bootcamp);
        devMaria.progredir();
        devMaria.progredir();

        Dev devPedro = new Dev("Pedro");
        devPedro.inscreverBootcamp(bootcamp);
        bootcamp.getForum().comentarPost(1, devPedro, "Muito bom");

        bootcamp.getDevsInscritos().forEach(dev -> {
            System.out.println("--- Dev " + dev.getNome() + " ---");
            System.out.println("Conteúdos inscritos: " + dev.getConteudosInscritos());
            System.out.println("Conteúdos concluídos: " + dev.getConteudosConcluidos());
            System.out.println("XP: " + dev.calcularTotalXp());
            System.out.println();

        });
        System.out.println("=== Ranking ===");
        bootcamp.imprimirRanking();
        System.out.println();

        System.out.println("=== Forum ===");
        bootcamp.getForum().getPosts().forEach(post -> {
            System.out.println("Autor: " + post.getAutor().getNome() + "   Publicado em: " + post.getDataDaPostagem().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")));
            System.out.println("Titulo: " + post.getTitulo());
            System.out.println("Conteúdo: " + post.getConteudo());
            System.out.println("Comentários:");
            post.getComentarios().forEach(System.out::println);
            System.out.println("----------------\n");
        });
    }


}
