package br.com.dio.desafio.domain;

import java.util.*;

public class Dev {
    private String name;
    private Set<Conteudo> enteredContents = new LinkedHashSet<>();
    private Set<Conteudo> completedContents = new LinkedHashSet<>();

    public void subscribeBootcamp(Bootcamp bootcamp){
        this.enteredContents.addAll(bootcamp.getContents());
        bootcamp.getRegisteredDevs().add(this);
    }

    public void progress(){
        Optional<Conteudo> content = this.enteredContents.stream().findFirst();
        if(content.isPresent()){
            completedContents.add(content.get());
            this.enteredContents.remove(content.get());
        }
        else {
            System.err.println("You are not enrolled in any content");
        }
    }

    public double calculateTotalXp() {
        return this.completedContents.stream().mapToDouble(content -> content.calculateXp()).sum();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Conteudo> getEnteredContents() {
        return enteredContents;
    }

    public void setEnteredContents(Set<Conteudo> enteredContents) {
        this.enteredContents = enteredContents;
    }

    public Set<Conteudo> getCompletedContents() {
        return completedContents;
    }

    public void setCompletedContents(Set<Conteudo> completedContents) {
        this.completedContents = completedContents;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(name, dev.name) && Objects.equals(enteredContents, dev.enteredContents) && Objects.equals(completedContents, dev.completedContents);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, enteredContents, completedContents);
    }
}
