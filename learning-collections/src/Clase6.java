

import model.Aula;
import model.Curso;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Clase6 {

    public static void main(String[] args) {

        Curso curso1 = new Curso("PHP",30);
        curso1.addClase(new Aula("ArrayList"));
        curso1.addClase(new Aula("List"));
        curso1.addClase(new Aula("LinkedList"));
        
        
        ArrayList<Curso> cursos = new ArrayList<>();
        cursos.add(curso1);

        System.out.println(cursos.get(0).getClaseList());

    }
}
