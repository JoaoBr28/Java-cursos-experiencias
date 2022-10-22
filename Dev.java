package Dominio;

import java.util.*;

public class Dev {
    private String name;

    private Set<Conteudo>conteudoInscristos = new HashSet<>();
    private Set<Conteudo> conteudoConcluidos = new LinkedHashSet<>();

    public void inscreverBotcamp(Botcamp botcamp) {
        this.conteudoInscristos.addAll(botcamp.getConteudos());
        botcamp.getDevInscritos().add(this);
        //this palavra reservada

    }
    public void progredir(){
        Optional<Conteudo> conteudo = this.conteudoInscristos.stream().findFirst();
        if (conteudo.isPresent()){
            this.conteudoConcluidos.add(conteudo.get());
            this.conteudoInscristos.remove(conteudo.get());
        }else{
            System.out.println("Voce não esta matriculado em nenhum contéudo");

        }

    }
    public void inscreverBootcamp(Botcamp bootcamp) {}
//    public void progredir(){}

    public double calcularTotalXp(){
        return this.conteudoConcluidos.stream().mapToDouble(conteudo -> conteudo.calcularXp()).sum();

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Conteudo> getConteudoInscristos() {
        return conteudoInscristos;
    }

    public void setConteudoInscristos(Set<Conteudo> conteudoInscristos) {
        this.conteudoInscristos = conteudoInscristos;
    }

    public Set<Conteudo> getConteudoConcluidos() {
        return conteudoConcluidos;
    }

    public void setConteudoConcluidos(Set<Conteudo> conteudoConcluidos) {
        this.conteudoConcluidos = conteudoConcluidos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(name, dev.name) && Objects.equals(conteudoInscristos, dev.conteudoInscristos) && Objects.equals(conteudoConcluidos, dev.conteudoConcluidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, conteudoInscristos, conteudoConcluidos);
    }
}
