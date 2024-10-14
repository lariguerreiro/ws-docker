package com.example.helloworldprojectdocker.controller;

import com.example.helloworldprojectdocker.entity.Language;
import com.example.helloworldprojectdocker.service.HelloWorldService;
import lombok.AllArgsConstructor;
import lombok.NonNull;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/api/hello-world")
public class HelloWorldController {

    private HelloWorldService helloWorldService;
    @GetMapping("/{language}")
    public void printHelloWorld(@PathVariable @NonNull String language){
        Language langEnum = Language.fromString(language);
        helloWorldService.printHelloWorld(langEnum);
    }
}
