public class Main {
    public static void main(String[] args) {
        int age = 27;
        double weight = 60;
        boolean isStudent = false;
        char gender = 'M';
        String name = "Serge KONAN";

        displayInfo(age, weight, isStudent, gender, name);
    }

    public static void displayInfo(int age, double weight, boolean isStudent, char gender, String name) {
        System.out.println("Name: " + name + ", Age: " + age + ", Gender: " + gender + ", Weight: " + weight + ", IsStudent: " + isStudent);
    }

}