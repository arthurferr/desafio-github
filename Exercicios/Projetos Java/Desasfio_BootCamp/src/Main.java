import dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        Curso curso2 = new Curso();

        curso1.setTitulo("BootCamp GFT");
        curso1.setDescricao("BootCamp GFT Java");
        curso1.setCargaHoraria(56);

        curso2.setTitulo("Web Development Take Blip");
        curso2.setDescricao("BootCamp de Desenvolcimento Web");
        curso2.setCargaHoraria(116);

        Mentorias mentoria = new Mentorias();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Mentoria em Java com Camila Cavalcante");
        mentoria.setData(LocalDate.now());

//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria);

        BootCamp bootCamp = new BootCamp();
        bootCamp.setNome("GFT Start #3 - Java");
        bootCamp.setDescricao("Treinamento bom pra Caramba");
        bootCamp.getConteudos().add(curso1);
        bootCamp.getConteudos().add(curso2);
        bootCamp.getConteudos().add(mentoria);

        Dev devArthur = new Dev();
        devArthur.setNome("Arthur H. Ferrarezi");
        devArthur.inscreverBootCamp(bootCamp);

        System.out.println("Nome: " + devArthur.getNome());
        System.out.println("Conteudos Inscritos: \n" + devArthur.getConteudoInscrito());
        devArthur.progresso();
        System.out.println("XP: \n" + devArthur.calcularXPTotal());
        System.out.println("Conteudos Finalizado: \n" + devArthur.getConteudoFinalziado());
        System.out.println("Conteudos Inscritos: \n" + devArthur.getConteudoInscrito());
        devArthur.progresso();
        System.out.println("XP:" + devArthur.calcularXPTotal());
        System.out.println("Conteudos Inscritos: \n" + devArthur.getConteudoInscrito());
        System.out.println("Conteudos Finalizado: \n" + devArthur.getConteudoFinalziado());
        devArthur.progresso();
        System.out.println("XP: \n" + devArthur.calcularXPTotal());





    }
}
