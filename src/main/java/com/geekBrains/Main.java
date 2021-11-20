package com.geekBrains;


public class Main {
    public static void main(String[] args) {

        Employee[] employeesArr = new Employee[5];
        employeesArr[0] = new Employee("Абрамов Наум Сергеевичч", "Администратор", "Dmtiriy@mail.ru", "+375(29)-532-92-47", 3000, 68);
        employeesArr[1] = new Employee("Жуков Артур Адольфович", "Специалист", "Zguk@mail.ru", "+375(44)-232-17-22", 800, 47);
        employeesArr[2] = new Employee("Попов Вольдемар Владимирович", "Специалист", "Pop@mail.ru", "+375(33)-654-63-15", 500, 26);
        employeesArr[3] = new Employee("Козлов Арнольд Иосифович", "Главный специалист", "Kozlov@mail.ru", "+375(44)-857-78-16", 1100, 30);
        employeesArr[4] = new Employee("Копылов Лавр Егорович", "Специалист", "Kop@mail.ru", "+375(29)-476-15-68", 600, 32);

        for (int i = 0; i < employeesArr.length; i++) {
            if (employeesArr[i].getAge() > 40) {
                System.out.println(employeesArr[i].getInfo());
            }
        }
    }
}
