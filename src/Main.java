public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        String firstName = "Ivan"; // имя
        String middleName = "Ivanovich"; // отчество
        String lastName = "Ivanov"; // фамилия
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println(fullName);
        System.out.println("Задание 2");
        System.out.println(fullName.toUpperCase());
        System.out.println("Задание 3");
        String firstNameTwo = "Семён"; // имя
        String middleNameTwo = "Семёнович"; // отчество
        String lastNameTwo = "Иванов"; // фамилия
        String fullNameTwo = lastNameTwo + " " + firstNameTwo + " " + middleNameTwo;
        fullNameTwo = fullNameTwo.replace("ё", "е");
        System.out.println(fullNameTwo);
    }

}