

import model.Aula;
import model.Curso;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Clase7 {

    public static void main(String[] args) {

        Curso curso1 = new Curso("PHP",30);
        curso1.addAula(new Aula("ArrayList"));
        curso1.addAula(new Aula("List"));
        curso1.addAula(new Aula("LinkedList"));
        
        List<Aula> aulaList = curso1.getAulaList();
        
        
        ArrayList<Curso> cursos = new ArrayList<>();
        cursos.add(curso1);

        System.out.println(cursos.get(0).getAulaList());

    }
}
