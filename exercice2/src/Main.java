public class Main {
    public static void main(String[] args) {
        int age = 27;
        double weight = 60.5;
        char gender = 'M';
        boolean isStudent = false;

        int intWeight = (int) weight;

        int totalAge = age + 5;

        if (age > 20) {
            System.out.println("Age is greater than 20");
        } else {
            System.out.println("Age is not greater than 20");
        }

        switch (gender) {
            case 'M':
                System.out.println("Gender is Male");
                break;
            case 'F':
                System.out.println("Gender is Female");
                break;
            default:
                System.out.println("Invalid Gender");
        }

        // Print values of all variables
        System.out.println("Age: " + age);
        System.out.println("Weight: " + weight);
        System.out.println("Gender: " + gender);
        System.out.println("Is Student: " + isStudent);
        System.out.println("Casted Weight: " + intWeight);
        System.out.println("Total Age: " + totalAge);
    }
}