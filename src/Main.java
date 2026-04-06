import br.com.dio.desafio.domain.Bootcamp;
import br.com.dio.desafio.domain.Curso;
import br.com.dio.desafio.domain.Dev;
import br.com.dio.desafio.domain.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso course1 = new Curso("Java Course 1", "description Java Course 1", 8);
        Curso course2 = new Curso("Java Course 2", "description Java Course 2", 8);
        Curso course3 = new Curso("Java Course 3", "description Java Course 3", 8);

        Mentoria mentoring1 = new Mentoria("Java Mentoring", "description Java Mentoring", LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setName("Bootcamp Java Developer");
        bootcamp.setDescription("Dsecription Bootcamp Java Developer");
        bootcamp.getContents().add(course1);
        bootcamp.getContents().add(course2);
        bootcamp.getContents().add(course3);
        bootcamp.getContents().add(mentoring1);

        Dev devDaniel = new Dev();
        devDaniel.setName("Daniel");
        devDaniel.subscribeBootcamp(bootcamp);
        System.out.println(devDaniel.getName() + " EnteredContents: " + devDaniel.getEnteredContents());
        System.out.println("--------------------------");
        devDaniel.progress();
        devDaniel.progress();
        System.out.println(devDaniel.getName() + " EnteredContents: " + devDaniel.getEnteredContents());
        System.out.println(devDaniel.getName() + " CompletedContents: " + devDaniel.getCompletedContents());
        System.out.println("XP: " + devDaniel.calculateTotalXp());

        System.out.println("===============================================");

        Dev devGusta = new Dev();
        devGusta.setName("Gustavo");
        devGusta.subscribeBootcamp(bootcamp);
        System.out.println(devGusta.getName() + " EnteredContents: " + devGusta.getEnteredContents());
        System.out.println("--------------------------");
        devGusta.progress();
        System.out.println(devGusta.getName() + " EnteredContents: " + devGusta.getEnteredContents());
        System.out.println(devGusta.getName() + " CompletedContents: " + devGusta.getCompletedContents());
        System.out.println("XP: " + devGusta.calculateTotalXp());
    }
}