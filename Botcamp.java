package Dominio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Botcamp{
    private String nome;
    private String descricao;
    private final LocalDate dataInicial = LocalDate.now();
    private final LocalDate dataFinal =dataInicial.plusDays(45);
    private Set<Dev> devInscritos = new HashSet<Dev>();
    private Set<Conteudo>conteudos= new LinkedHashSet<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDesricao() {
        return descricao;
    }

    public void setDesricao(String desricao) {
        this.descricao = desricao;
    }

    public LocalDate getDataInicial() {
        return dataInicial;
    }

    public LocalDate getDataFinal() {
        return dataFinal;
    }

    public Set<Dev> getDevInscritos() {
        return devInscritos;
    }

    public void setDevInscritos(Set<Dev> devInscritos) {
        this.devInscritos = devInscritos;
    }

    public Set<Conteudo> getConteudos() {
        return conteudos;
    }

    public void setConteudos(Set<Conteudo> conteudos) {
        this.conteudos = conteudos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Botcamp botcamp = (Botcamp) o;
        return Objects.equals(nome, botcamp.nome) && Objects.equals(descricao, botcamp.descricao) && Objects.equals(dataInicial, botcamp.dataInicial) && Objects.equals(dataFinal, botcamp.dataFinal) && Objects.equals(devInscritos, botcamp.devInscritos) && Objects.equals(conteudos, botcamp.conteudos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, descricao, dataInicial, dataFinal, devInscritos, conteudos);
    }
}

