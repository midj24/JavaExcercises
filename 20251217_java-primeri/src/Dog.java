public class Dog extends Animal {
    @Override
    public void sound() {
       // super.sound(); Ovo je zvuk od Parent klase
        System.out.println("Dog sound: Woof Woof");
    }
}
