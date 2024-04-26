package builder;

import java.time.LocalDate;

public class User {
    private final String firstName;

    private final String lastName;

    private final String fatherName;

    private final int age;

    private final LocalDate birthDate;

    private final String job;

    private final boolean isMarried;

    private final String address;

    private final String userName;

    private final String password;

    private User(Builder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.fatherName = builder.fatherName;
        this.age = builder.age;
        this.birthDate = builder.birthDate;
        this.job = builder.job;
        this.isMarried = builder.isMarried;
        this.address = builder.address;
        this.userName = builder.userName;
        this.password = builder.password;
    }

    public static class Builder {
        private String firstName;
        private String lastName;
        private String fatherName;
        private int age;
        private LocalDate birthDate;
        private String job;
        private boolean isMarried;
        private String address;
        private String userName;
        private String password;

        public Builder firstName(String firstName) {
            this.fatherName = firstName;
            return this;
        }

        public Builder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder fatherName(String firstName) {
            this.fatherName = firstName;
            return this;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Builder birthDate(LocalDate birthDate) {
            this.birthDate = birthDate;
            return this;
        }

        public Builder job(String job) {
            this.job = job;
            return this;
        }

        public Builder isMarried(boolean isMarried) {
            this.isMarried = isMarried;
            return this;
        }

        public Builder address(String address) {
            this.address = address;
            return this;
        }

        public Builder username(String userName) {
            this.userName = userName;
            return this;
        }
        public Builder password(String password) {
            this.password = password;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", fatherName='" + fatherName + '\'' +
                ", age=" + age +
                ", birthDate=" + birthDate +
                ", job='" + job + '\'' +
                ", isMarried=" + isMarried +
                ", address='" + address + '\'' +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
