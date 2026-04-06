package br.com.dio.desafio.domain;

public sealed abstract class Conteudo permits Curso, Mentoria{
    protected static double XP_PADRAO = 10d;
    protected String title;
    protected String description;

    public abstract double calculateXp();

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
