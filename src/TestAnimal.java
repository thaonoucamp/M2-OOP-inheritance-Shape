public class TestAnimal {
    public static void main(String[] args) {
        Animal animal = new Animal();
        System.out.println(animal);

        animal = new Animal("red", false );
        System.out.println(animal);
    }
}
