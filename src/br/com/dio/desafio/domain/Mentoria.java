package br.com.dio.desafio.domain;
import java.time.LocalDate;

public non-sealed class Mentoria extends Conteudo {
    private LocalDate date;

    public Mentoria(String title, String description, LocalDate date) {
        this.title = title;
        this.description = description;
        this.date = date;
    }

    @Override
    public double calculateXp() {
        return XP_PADRAO += 20d;
    }

    public LocalDate getLocalDate() {
        return date;
    }

    public void setLocalDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", date=" + date +
                '}';
    }
}
