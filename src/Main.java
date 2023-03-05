import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();
    }
//    Задание 5
    private static void task5() {
        int value = 33;
        changeValue1(value);
        System.out.println(value);
    }
    private static void changeValue1(int value) {
        value = 22;
    }
//    Задание 6
    private static void task6() {
        Integer value = 33;
        changeValue1(value);
        System.out.println(value);
    }
    private static void changeValue1(Integer value) {
        value = 22;
    }
//    Задание 7
    private static void task7() {
        Integer[] value = new Integer[]{3,4};
        changeValue2(value);
        System.out.println(Arrays.toString(value));
    }
    private static void changeValue2(Integer[] value) {
        value = new Integer[]{1,2};
    }
//    Задание 8
    private static void task8() {
        Integer[] value = new Integer[]{3,4};
        changeValue3(value);
        System.out.println(Arrays.toString(value));
    }
    private static void changeValue3(Integer[] value) {
        value [0] = 99;
    }
//    Задание 9
    private static void task9() {
        Person value = new Person();
        value.name = "Lyapis";
        value.surname = "Trubetskoy";
        changePerson(value);
        System.out.println(value);
    }
    private static void changePerson(Person value) {
        value = new Person();
        value.name = "Ilya";
        value.surname = "Lagutenko";
    }
//    Задание 10
    private static void task10() {
        Person value = new Person();
        value.name = "Lyapis";
        value.surname = "Trubetskoy";
        changePerson2(value);
        System.out.println(value);
}
    private static void changePerson2(Person person) {
        person.name = "Ilya";
        person.surname = "Lagutenko";
    }
    public static class Person {
        public String name;
        public String surname;

        @Override
        public String toString() {
            return name + " " + surname;
        }
    }
}