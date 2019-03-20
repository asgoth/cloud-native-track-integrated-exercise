package com.example.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/hello", produces = "text/html")
public class DemoController {

    @GetMapping
    public ResponseEntity<String> helloWorld() {
        String color = (System.getenv("COLOR") == null) ? "white" : System.getenv("COLOR");
        String hello = "<html>\n"
                + "<header><title>This is title</title></header>\n"
                + "<body style='background-color: '" + color + "'>\n"
                + "Hello world\n"
                + "</body>\n"
                + "</html>";
        return ResponseEntity.ok(hello);
    }
}
