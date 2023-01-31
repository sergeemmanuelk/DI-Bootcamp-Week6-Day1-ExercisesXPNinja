public class Main {
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person("Serge KONAN", 30, 'M');
        Person person3 = new Person("Serge Emmanuel", 27);

        person1.displayInfo();
        person2.displayInfo();
        person3.displayInfo();
    }
}