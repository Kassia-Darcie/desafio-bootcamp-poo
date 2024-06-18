import br.com.dio.desafiobootcamp.dominio.Bootcamp;
import br.com.dio.desafiobootcamp.dominio.Curso;
import br.com.dio.desafiobootcamp.dominio.Dev;
import br.com.dio.desafiobootcamp.dominio.Mentoria;

import java.sql.Array;
import java.time.LocalDate;
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

        Dev devKassia = new Dev("kassia");
        devKassia.inscreverBootcamp(bootcamp);
        devKassia.progredir();
        devKassia.progredir();
        devKassia.progredir();

        Dev devJoao = new Dev("João");
        devJoao.inscreverBootcamp(bootcamp);
        devJoao.progredir();

        Dev devMaria = new Dev("Maria");
        devMaria.inscreverBootcamp(bootcamp);
        devMaria.progredir();
        devMaria.progredir();

        Dev devPedro = new Dev("Pedro");
        devPedro.inscreverBootcamp(bootcamp);

        bootcamp.getDevsInscritos().forEach(dev -> {
            System.out.println("--- Dev " + dev.getNome() + " ---");
            System.out.println("Conteúdos inscritos: " + dev.getConteudosInscritos());
            System.out.println("Conteúdos concluídos: " + dev.getConteudosConcluidos());
            System.out.println("XP: " + dev.calcularTotalXp());
            System.out.println();

        });
        System.out.println("=== Ranking ===");
        bootcamp.imprimirRanking();
    }


}
