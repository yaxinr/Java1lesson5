//package com.company;

//import Person.Person;

public class Main {

    public static void main(String[] args) {
        Person[] persArray = new Person[5]; // Вначале объявляем массив объектов
        persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30); // потом для каждой ячейки массива задаем объект
        persArray[1] = new Person("Petrov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 40);
        persArray[2] = new Person("Petrov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 41);
        persArray[3] = new Person("Petrov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
        persArray[4] = new Person("Petrov Petr", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 50);
        for (Person p : persArray){
            if(p.getAge() > 40)
                p.print();
        }
    }
}
