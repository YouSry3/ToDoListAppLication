package Objects;

public class User {

    private String username;
    private String email;
    private String password;
    private String fullName;
    private String age;
    private String phoneNumber;
    private String gender;

    // Constructor
    public User(String username, String email, String password,
                String fullName, String age, String gender, String phoneNumber) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.fullName = fullName;
        this.age = age;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
    }

    // Constructor for login only
    public User(String email, String password) {
        this("", email, password, "", "", "", "");
    }

    // Static factory methods (optional syntactic sugar)
    public static User forRegistration(String username, String email, String password,
                                       String fullName, String age, String gender, String phoneNumber) {
        return new User(username, email, password, fullName, age, gender, phoneNumber);
    }

    public static User forLogin(String email, String password) {
        return new User(email, password);
    }

    // Getters and Setters
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", fullName='" + fullName + '\'' +
                ", age='" + age + '\'' +
                ", gender='" + gender + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
