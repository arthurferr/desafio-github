import dominio.Curso;
import dominio.Mentorias;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();

        curso1.setTitulo("BootCamp GFT");
        curso1.setDescricao("BootCamp GFT Java");
        curso1.setCargaHoraria(56);

        System.out.println(curso1);


        Mentorias mentoria = new Mentorias();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Mentoria em Java com Camila Cavalcante");
        mentoria.setData(LocalDate.now());

        System.out.println(mentoria);
    }
}
