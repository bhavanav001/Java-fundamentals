
public class agevalid1{

    static void checkAge(int age) throws Exception {
        if (age < 18)
            throw new Exception("Not eligible to vote");
        else
            System.out.println("Eligible to vote");
    }

    public static void main(String[] args) {
        try {
            checkAge(17);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}