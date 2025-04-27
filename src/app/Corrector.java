package app;

public class Corrector {
    //Додаємо публічний метод, який приймає масив рядків (String[]) і повертає один рядок
    public String handleData(String[] strs) {
//Створюємо об'єкт для поступового складання тексту
        StringBuilder stringBuilder = new StringBuilder();
//Створюємо змінну для нумерації слів (розпочинаємо з 1)
        int count = 1;
//Додаємо цикл for-each який перебирає кожен рядок (слово) в масиві strs
        for (String str : strs) {
//якщо слово містить букву "b", то замінюємо на "o"
            if (str.contains("b")) {
                str = str.replace("b", "o");

            }
//Додаємо нумерацію слова, дужку і пробіл після номера, виправлене слово, і перехід на новий рядок
            stringBuilder.append(count).append(") ").append(str).append("\n");
//Збільшуємо номер для наступного слова
            count++;
        }
        //Перетворюємо весь зібраний текст із StringBuilder у звичайний рядок і повертаємо його
        return stringBuilder.toString();
    }
}
