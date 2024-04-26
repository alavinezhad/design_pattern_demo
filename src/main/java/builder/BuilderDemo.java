package builder;

import java.time.LocalDate;

public class BuilderDemo {
    public static void main(String[] args) {
        User user = new User.Builder()
                .firstName("Hassan")
                .lastName("Alavi")
                .fatherName("Ali Akbar")
                .age(54)
                .birthDate(LocalDate.parse("1970-05-22"))
                .job("consultance")
                .isMarried(true)
                .address("Narmak")
                .username("alavi1970")
                .password("12344")
                .build();

        System.out.println(user);

        UserLombok userLombok = UserLombok.builder()
                .firstName("Hassan")
                .lastName("Alavi")
                .fatherName("Ali Akbar")
                .age(54)
                .birthDate(LocalDate.parse("1970-05-22"))
                .job("consultance")
                .isMarried(true)
                .address("Narmak")
                .username("alavi1970")
                .password("12344")
                .build();
        System.out.println("user lombok: " + userLombok);
    }
}
