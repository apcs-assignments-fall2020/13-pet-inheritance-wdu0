public class DogClient {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        System.out.println(d1.toString());
        d1.makeNoise();
        System.out.println(d1.getAge());

        Dog d2 = new Dog("Yoyo", 5, "Teddy");
        System.out.println(d2.toString());
        d2.makeNoise();
        System.out.println(d2.getBreed());
    }
}