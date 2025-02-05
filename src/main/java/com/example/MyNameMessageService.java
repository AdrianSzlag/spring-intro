package com.example;

import org.springframework.stereotype.Component;

@Component("messageService")
public class MyNameMessageService implements MessageService {

    private final String[] messages = {"Wiadomosc 1\n", "Wiadomosc 2\n", "Wiadomosc 3\n", "Wiadomosc 4\n","Wiadomosc 5\n", "Wiadomosc 6\n", "Wiadomosc 7\n", "Wiadomosc 8\n", "Wiadomosc 9\n", "Wiadomosc 10\n"};
    @Override
    public String getMessage() {
        return "Adrian Szlag";
    }
}
