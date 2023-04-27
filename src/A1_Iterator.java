import java.util.ArrayList;
import java.util.Iterator;

public class A1_Iterator {
    public static void main(String[] args){
        ArrayList<String> studentNames= new ArrayList<>();
        studentNames.add("Asli");
        studentNames.add("Rustem");
        studentNames.add("sahan");
        studentNames.add("erdem");
        System.out.println(studentNames);

        Iterator<String> names= studentNames.iterator();
        while (names.hasNext()){
            System.out.println(names.next());
        }
    }
}
