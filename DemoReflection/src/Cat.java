public class Cat implements Animal {
    @Override
    public String getName() {
        return "Cat";
    }

    @Override
    public void speak() {
        System.out.println("Con meo");
    }
}
