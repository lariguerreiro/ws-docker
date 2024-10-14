package com.example.helloworldprojectdocker.service;

import com.example.helloworldprojectdocker.entity.HelloWorldEntity;
import com.example.helloworldprojectdocker.entity.Language;
import com.example.helloworldprojectdocker.repository.HelloWorldRepository;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class HelloWorldService {

    final HelloWorldRepository helloWorldRepository;

    @PostConstruct
    public void init() {
        // Check if the database is empty before inserting initial data
        if (helloWorldRepository.count() == 0) {
            helloWorldRepository.save(HelloWorldEntity.builder()
                    .id(UUID.randomUUID())
                    .language(Language.ENGLISH)
                    .helloMessage("Hello, World!")
                    .build());
            helloWorldRepository.save(HelloWorldEntity.builder()
                    .id(UUID.randomUUID())
                    .language(Language.SPANISH)
                    .helloMessage("Hola, Mundo!")
                    .build());
            helloWorldRepository.save(HelloWorldEntity.builder()
                    .id(UUID.randomUUID())
                    .language(Language.FRENCH)
                    .helloMessage("Bonjour, le Monde!")
                    .build());
            helloWorldRepository.save(HelloWorldEntity.builder()
                    .id(UUID.randomUUID())
                    .language(Language.GERMAN)
                    .helloMessage("Hallo, Welt!")
                    .build());
            helloWorldRepository.save(HelloWorldEntity.builder()
                    .id(UUID.randomUUID())
                    .language(Language.ITALIAN)
                    .helloMessage("Ciao, Mondo!")
                    .build());
            helloWorldRepository.save(HelloWorldEntity.builder()
                    .id(UUID.randomUUID())
                    .language(Language.PORTUGUESE)
                    .helloMessage("Olá, Mundo!")
                    .build());
            helloWorldRepository.save(HelloWorldEntity.builder()
                    .id(UUID.randomUUID())
                    .language(Language.JAPANESE)
                    .helloMessage("こんにちは世界!")
                    .build());
            helloWorldRepository.save(HelloWorldEntity.builder()
                    .id(UUID.randomUUID())
                    .language(Language.RUSSIAN)
                    .helloMessage("Привет, мир!")
                    .build());
            helloWorldRepository.save(HelloWorldEntity.builder()
                    .id(UUID.randomUUID())
                    .language(Language.HINDI)
                    .helloMessage("नमस्ते दुनिया!")
                    .build());
            helloWorldRepository.save(HelloWorldEntity.builder()
                    .id(UUID.randomUUID())
                    .language(Language.CARIOCA)
                    .helloMessage("E aí, Mundo!")
                    .build());
        }
    }
    public void printHelloWorld(Language language) {

        // Fetch the hello message from the repository based on the language
        String helloMessage = helloWorldRepository.findHelloMessageByLanguage(language);

        if (helloMessage != null) {
            System.out.println(helloMessage);
        } else {
            System.out.println("Language not supported!");
        }
    }
}
