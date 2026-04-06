import br.com.dio.desafio.domain.Curso;
import br.com.dio.desafio.domain.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso course1 = new Curso("Java Course", "description Java Course", 8);
        System.out.println(course1);

        Mentoria mentoring1 = new Mentoria("Java Mentoring", "description Java Mentoring", LocalDate.now());
        System.out.println(mentoring1);
    }
}