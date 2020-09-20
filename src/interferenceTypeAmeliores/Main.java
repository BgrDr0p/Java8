package interferenceTypeAmeliores;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        // Interférence de types => ancienne versions
        ArrayList<String> maListe = new ArrayList<>();

        List<Object> emptyList = Collections.emptyList();

       // maListe = Collections.emptyList();


        Method[] methods = Personne.class.getDeclaredMethods();

        for (Method method : methods) {
            System.out.println("Methode : " + method.getName());
            Parameter[] parameters = method.getParameters();

            for(Parameter parameter : parameters) {
                System.out.println("type du paramètre " + parameter.getType() );
                System.out.println("nom du paramètre " + parameter.getName() );
            }

        }
    }
}
