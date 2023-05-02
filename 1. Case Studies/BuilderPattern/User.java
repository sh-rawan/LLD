package BuilderPattern;

public class User{
    private final int id;
    private final String name;
    private  final String phoneNumber;
    private  final int age;

    // public User(int id, String name){
    //     this.id = id;
    //     this.name = name;
    //     this.phoneNumber = "";
    //     this.age = 0;
    // }

    private User(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.phoneNumber = builder.phoneNumber;
        this.age = builder.age;
    }


    // public void setPhoneNumber(String phoneNumber) {
    //     this.phoneNumber = phoneNumber;
    // }

    // public void setAge(int age) {
    //     this.age = age;
    // }

    public static class Builder {
        private final int id;
        private final String name;
        private String phoneNumber;
        private int age;
        
        public Builder(int id, String name) {
            this.id = id;
            this.name = name;
            this.phoneNumber = "";
            this.age = 0;
        }

        public Builder setPhoneNumber(String phoneNumber){
            this.phoneNumber = phoneNumber;
            return this;
        }

        public Builder setAge(int age){
            this.age = age;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }

}
