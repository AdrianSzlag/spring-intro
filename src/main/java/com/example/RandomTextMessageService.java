package com.example;

import java.util.Random;

public class RandomTextMessageService implements MessageService{
    private final String[] messages = {"Wiadomosc 1\n", "Wiadomosc 2\n", "Wiadomosc 3\n", "Wiadomosc 4\n", "Wiadomosc 5\n", "Wiadomosc 6\n", "Wiadomosc 7\n", "Wiadomosc 8\n", "Wiadomosc 9\n", "Wiadomosc 10\n"};
    private final Random random;
    public RandomTextMessageService(){
        random = new Random();
    }
    @Override
    public String getMessage() {
        return messages[random.nextInt(10)];
    }
}
