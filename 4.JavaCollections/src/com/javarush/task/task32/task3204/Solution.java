package com.javarush.task.task32.task3204;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

/* 
Генератор паролей
Реализуй логику метода getPassword, который должен возвращать ByteArrayOutputStream, в котором будут байты пароля.
Требования к паролю:
1) 8 символов.
2) только цифры и латинские буквы разного регистра.
3) обязательно должны присутствовать цифры, и буквы разного регистра.
Все сгенерированные пароли должны быть уникальные.

Пример правильного пароля:
wMh7smNu
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        ByteArrayOutputStream password = getPassword();
        System.out.println(password.toString());

    }

    public static ByteArrayOutputStream getPassword() throws IOException {
        ArrayList<String> passwords = new ArrayList<>();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        StringBuffer passw = new StringBuffer();
        Random random = new Random();

        char[] password = new char[8];

        for (int i = 0; i < password.length; i++) {

            if (i % 2 == 0) {
                password[i] = (char) (random.nextInt((122 - 97) + 1) + 97);
            } else if (i % 3 == 0) {
                password[i] = (char) (random.nextInt((90 - 65) + 1) + 65);
            } else {
                password[i] = (char) (random.nextInt((57 - 48) + 1) + 48);

            }

            passw.append(password[i]);
        }

        byteArrayOutputStream.write(passw.toString().getBytes());

        return byteArrayOutputStream;
    }
}