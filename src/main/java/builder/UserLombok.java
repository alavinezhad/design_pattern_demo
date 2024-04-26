package builder;

import lombok.Builder;

import java.time.LocalDate;

@Builder

public class UserLombok {
    private final String firstName;

    private final String lastName;

    private final String fatherName;

    private final int age;

    private final LocalDate birthDate;

    private final String job;

    private final boolean isMarried;

    private final String address;

    private final String username;

    private final String password;

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
                ", userName='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
