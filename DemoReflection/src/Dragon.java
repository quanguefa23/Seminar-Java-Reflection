public class Dragon implements Animal {
    @Override
    public String getName() {
        return "Dragon";
    }

    @Override
    public void speak() {
        System.out.println("Con rong");
    }

    public void fly() {
        System.out.println(getName() + " is flying");
    }

    public void fire() {
        System.out.println(getName() + " is spewing fire");
    }
}
