package app;

public class Main {
    public static void main(String[] args) {
        /*
        getOutput(...) - результат роботи методу handleData() передається в метод getOutput, який виводить його на екран.
new Corrector().handleData(...) - створюємо новий об'єкт класу Corrector і викликаємо його метод handleData(),
передаючи туди масив, отриманий з DataProvider:
- new Corrector() - екземпляр класу Corrector, в якому реалізована логіка виправлення слів.
- .handleData(...) - передаємо масив слів в метод handleData(), який обробляє цей масив,
виправляючи помилки, і повертаючи готовий текст.
new DataProvider().getData() - створюємо новий об'єкт класу DataProvider(клас надає дані) і викликаємо в ньому
метод getData(), який повертає масив слів:
-getData() повертає масив строк ({"brange", "plum", "tomato", "onibn", "grape"}).
-new DataProvider() - створення нового екземпляра класу DataProvider.
-.getData() — викликаємо метод getData(), щоб отримати масив слів.
         */
        getOutput(new Corrector().handleData(
                new DataProvider().getData()
        ));
    }
//Оголошуємо метод getOutput, який приймає один параметр output типу String
    //Виводимо значення на екран яке передали в output
    private static void getOutput(String output) {
        System.out.println(output);
    }
}
