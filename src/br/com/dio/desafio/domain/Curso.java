package br.com.dio.desafio.domain;

public class Curso {
    private String title;
    private String description;
    private int hourlyLoad;

    public Curso(String title, String description, int hourlyLoad) {
        this.title = title;
        this.description = description;
        this.hourlyLoad = hourlyLoad;
    }

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
