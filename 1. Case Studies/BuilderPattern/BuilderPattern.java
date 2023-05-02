package BuilderPattern;

public class BuilderPattern {
    
    public static void main(String[] args) {
        // Method 1
        User.Builder builder = new User.Builder(2, "Jack");
        builder.setPhoneNumber("88-3977-6321");
        builder.setAge(24);
        User usr = new User(builder);


        // Method 2
        User usr2 = new User.Builder(2, "Jack")
                            .setPhoneNumber("88-3977-6321")
                            .setAge(24).build();
    }
}
 