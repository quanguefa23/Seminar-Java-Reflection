public class Dog implements Animal {
    @Override
    public String getName() {
        return "Dog";
    }

    @Override
    public void speak() {
        System.out.println("Con cho");
    }
}
