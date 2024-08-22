import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Conteudo;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) {

        Curso c1 = new Curso();
        c1.setTitulo("Curso java");
        c1.setDescricao("Descriçao curso java");
        c1.setCargaHoraria(10);
        
        
        
        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de java");
        mentoria.setDescricao("Mentorias com profissionais javas");
        mentoria.setData(LocalDate.now());


        Bootcamp bc = new Bootcamp();
        bc.setNome("Bootcamp Java Developer");
        bc.setDescricao("Descriçao Bootcamp Java developer");
        bc.getConteudos().add(mentoria);
        bc.getConteudos().add(c1);

        Dev jeff = new Dev();
        jeff.setNome("Jefferson");
        jeff.inscreverBootcamp(bc);
        System.out.println("Conteudos inscritos"+ jeff.getConteudosInscritos());
        jeff.progredir();

        System.out.println("Conteudos inscritos"+ jeff.getConteudosInscritos());
        System.out.println("Conteudos concluidos"+ jeff.getConteudosConcluidos());

    }
}
