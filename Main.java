package Dominio ;

import java.time.LocalDate;

public class Main {
      public static void main(String[] args) {
        

        Curso cursos1 = new Curso();
        cursos1.setTitulo("progamacao orientada a objetos");
        cursos1.setDescricao("Funadamentos java");
        cursos1.setCargaHoraria(80);
        System.out.println(cursos1);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("progamacao orientada a objetos");
        mentoria.setDescricao("Funadamentos java");
        mentoria.setData(LocalDate.now());

        Conteudo conteudo = new Curso();


        Curso cursos2 = new Curso();
        cursos2.setTitulo("progamacao orientada a objetos");
        cursos2.setDescricao("Funadamentos java");
        cursos2.setCargaHoraria(80);
        System.out.println(cursos2);
        System.out.println(mentoria);

        Botcamp botcamp = new Botcamp();
        botcamp.setNome("Botcamp java Developer");
        botcamp.setDesricao("Descrição Botcamp java developer") ;
        botcamp.getConteudos().add(cursos1);
        botcamp.getConteudos().add(cursos2);
        botcamp.getConteudos().add(mentoria);

        Dev devCamila = new Dev();
        devCamila.setName("Camila");
        devCamila.inscreverBootcamp(botcamp);
        System.out.println("Conteudos Inscritos Camila :" + devCamila.getConteudoInscristos());
        devCamila.progredir();
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("Conteudos Inscritos Camila :" + devCamila.getConteudoInscristos());
        System.out.println("Conteudos Inscritos Camila :" + devCamila.getConteudoConcluidos());
        System.out.println("XP"+ devCamila.calcularTotalXp());


        Dev devjoao = new Dev();
        devjoao.setName("joao");
        devjoao.inscreverBootcamp(botcamp);
        System.out.println("Conteudos Inscritos joao :" + devjoao.getConteudoInscristos());
        devjoao.progredir();
        devjoao.progredir();
        devjoao.progredir(); 
        System.out.println("Conteudos Inscritos joao :" + devjoao.getConteudoInscristos());
        System.out.println("Conteudos Inscritos joao :" + devjoao.getConteudoConcluidos());
        System.out.println("XP"+ devjoao.calcularTotalXp());
    }
}
