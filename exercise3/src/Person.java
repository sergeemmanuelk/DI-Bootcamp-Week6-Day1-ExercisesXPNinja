public class Person {
    String name;
    int age;
    char gender;

    Person() {
        this.name = "Unknown";
        this.age = 0;
        this.gender = 'U';
    }

    Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.gender = 'U';
    }

    void displayInfo() {
        System.out.println("Name: " + this.name + ", Age: " + this.age + ", Gender: " + this.gender);
    }
}
