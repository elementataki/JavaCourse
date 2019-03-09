package com.playtika.automation.homework3;

/*
Программа запрашивает у пользователя ФИО, мобильный телефон и email, и проверяет данные на валидность с помощью регулярных выражений.
ФИО - только буквы английского  алфавита, дефис и пробел
Мобильный телефон - +380 далее 2 цифры кода (украина) и 7 любых цифр
email - любые латинские символы, цифры, дефис и нижний прочерк, обязательный символ @ и .
Проверить все вводимые данные и вывести неверно введенные.
*/

import java.util.Scanner;
import java.util.regex.Pattern;

public class Task4 {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        System.out.print("Enter first name and last name: ");
        String nameInput = console.nextLine();

        System.out.print("Enter mobile phone number in format +380 XX XXXXXXX: +380 ");
        String phoneInput = console.nextLine();

        System.out.print("Enter email: ");
        String emailInput = console.nextLine();

        System.out.println();

        Pattern name = Pattern.compile("^[a-zA-Z']+(-[a-zA-Z']+)?(\\s[a-zA-Z']+(-[a-zA-Z']+)?)+$");
        if (!(name.matcher(nameInput).matches())) {
            System.out.printf("Entered name '%s' is invalid%n", nameInput);
        }

        Pattern phone = Pattern.compile("^[0-9]{2}\\s[0-9]{7}$");
        if (!(phone.matcher(phoneInput).matches())) {
            System.out.printf("Entered phone number '+380 %s' is invalid%n", phoneInput);
        }

        Pattern email = Pattern.compile("^\\w([_a-zA-Z0-9-]+)\\w(\\.\\w[_a-zA-Z0-9-]\\w+)*@[a-zA-Z0-9]+(\\.[a-zA-Z0-9]+)*(\\.[a-zA-Z]{2,})$");
        if (!(email.matcher(emailInput).matches())) {
            System.out.printf("Entered email '%s' is invalid%n", emailInput);
        }
    }
}
