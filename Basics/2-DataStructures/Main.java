import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String[] vowels = {"a","e","i","o","u"};
		
		List<String> vowelsList = Arrays.asList(vowels);
		System.out.println(vowelsList);

        Cursos cursos = new Cursos();
        cursos.setId(1);
        List<Cursos> listaDecursos = new ArrayList<>();
        System.out.println(listaDecursos);

    }

}