public class Bird implements Animal {
    @Override
    public String getName() {
        return "Bird";
    }

    @Override
    public void speak() {
        System.out.println("Con chim");
    }

    public void fly() {
        System.out.println(getName() + " is flying");
    }
}
