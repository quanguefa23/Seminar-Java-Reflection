import java.lang.reflect.*;
import java.util.ArrayList;
import java.util.List;

public class MainActivity {
    public static List<Animal> zoo;
    public static void main(String... argv) {
        zoo = new ArrayList<>();

        createAnimalsNormally();
        createAnimalsByReflection();

        flyIfPossible();
    }

    private static void flyIfPossible() {
        for(Animal a : zoo) {
            Class cls = a.getClass();
            try {
                Method flyMethod = cls.getMethod("fly", null);
                flyMethod.invoke(a, null);
            } catch (Exception ignored) {
            }
        }
    }

    private static void createAnimalsByReflection() {
        Class dragonClass = Dragon.class;
        try {
            Constructor constructor = dragonClass.getConstructor();
            Dragon newDragon = (Dragon) constructor.newInstance();
            zoo.add(newDragon);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void createAnimalsNormally() {
        zoo.add(new Bird());
        zoo.add(new Dog());
        zoo.add(new Cat());
    }
}
