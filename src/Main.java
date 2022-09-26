import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int value = 33;
        changeValue(value);
        System.out.println(value);
        Integer value1 = 33;
        changeValue1(value1);
        System.out.println(value1);
        Integer[] value2 = {3, 4};
        changeValue2(value2);
        System.out.println(Arrays.toString(value2));
        Integer[] value3 = {3, 4};
        changeValue3(value3);
        System.out.println(Arrays.toString(value3));
        Person person = new Person("Lyapis", "Trubetskoy");
        changePerson(person);
        System.out.println(person);
        changePerson1(person);
        System.out.println(person);
    }

    private static void changeValue(int value) {
        value = 22;

    }

    private static void changeValue1(Integer value1) {
        value1 = 22;

    }

    private static void changeValue2(Integer value[]) {
        Integer[] value2 = {1, 2};

    }

    private static void changeValue3(Integer value[]) {
        value [0] = 99;
    }

    private static void changePerson(Person person) {
        Person person1 = new Person("Ilya", "Lagutenko");
    }

    private static void changePerson1(Person person1) {
        person1.setName("Ilya");
        person1.setSurname("Lagutenko");
    }
}
//5.у переменной будет значение 33, так как нельзя записать в переменную, которую мы передаём в метод,
//указатель на новое значение внутри метода.

//6.у переменной будет значение 33, так как нельзя записать в переменную, которую мы передаём в метод,
//указатель на новый объект внутри метода.
//Задачи 5 и 6 аналогичны:  передавая в метод примитивную переменную в качестве параметра, мы не влияем
// на изначальную переменную, которая существует вне нашего метода.

//7.у массива будут значения [3, 4], так как нельзя записать в массив, который мы передаём в метод,
//ссылку на новые значения внутри метода.

//8.у массива будут значения [3, 4], так как нельзя записать в массив, который мы передаём в метод,
//ссылку на новые значения внутри метода.
//Задачи 7 и 8 аналогичны: передавая в метод ссылку на объект в качестве параметра, мы не влияем
// на изначальную ссылку на объект, которая существует вне нашего метода.

//9.у объект Person осталось состояние Lyapis Trubetskoy,так как с помощью оператора присваивания
// нельзя записать в объект, который мы передаём в метод, ссылку на новое состояние объекта внутри метода.

//10.объект Person изменил свое состояние, так как обе ссылки (person и person1) вели на одну ячейку в памяти и,
// изменив состояние в person1 с помощью сеттеров, мы изменили и то состояние, которое было в person.
//Задачи 9 и 10 противоположны: передавая в метод ссылку на состояние объекта в качестве параметра, мы не влияем
// на изначальное состояние объекта, который существует вне нашего метода; и только передав в метод ссылку
// на состояние объекта при помощи сеттера (т.е. ссылку на ту же самую ячейку), мы изменяем состояние объекта,
// который существует вне нашего метода.





