package sdacademy.ktw9.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sdacademy.ktw9.model.Greeting;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

@RestController
public class GreetingController {

    private AtomicInteger counter = new AtomicInteger();
    private List<String> names = new LinkedList<>();

    @GetMapping("/greeting")
    public Greeting greet (@RequestParam (value = "name", defaultValue = "World!") String name) {
        return new Greeting(counter.incrementAndGet(), "Hello " + name + "!");
    }

    @PostMapping ("/names")
    public ResponseEntity <?> addName (@RequestParam ("name") String name) {
        names.add(name);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping ("/names")
    public ResponseEntity <?> getNames () {
        return new ResponseEntity<>(names, HttpStatus.I_AM_A_TEAPOT);
    }

    @GetMapping("/names/{index}")
    public String getName (@PathVariable ("index") int index) {

        return names.get(index);
    }

}
