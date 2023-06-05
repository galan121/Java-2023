package Seminar_5;

public class Main {
    public static void main(String[] args) {
        PhoneBook phones = new PhoneBook();
        phones.PhoneNameAdd("Иванов");
        phones.PhoneNameAdd("Смирнова");
        phones.PhoneNameAdd("Петрова");
        phones.PhoneNameAdd("Круть");
        phones.PhoneNameAdd("Галушкин");
        phones.generateNumbers();
        System.out.println("\nКнига после заполненения:");
        phones.printPhoneBook();
        System.out.println("\nОтсортированная книга по кол-ву номеров:");
        phones.sortedPrint();
    }
}