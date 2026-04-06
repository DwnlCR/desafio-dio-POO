package br.com.dio.desafio.domain;
public non-sealed class Curso extends Conteudo{
    private int hourlyLoad;

    public Curso(String title, String description, int hourlyLoad) {
        this.title = title;
        this.description = description;
        this.hourlyLoad = hourlyLoad;
    }

    @Override
    public double calculateXp() {
        return XP_PADRAO * hourlyLoad;
    }
    public int getHourlyLoad() {
        return hourlyLoad;
    }

    public void setHourlyLoad(int hourlyLoad) {
        this.hourlyLoad = hourlyLoad;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", hourlyLoad=" + hourlyLoad +
                '}';
    }
}
