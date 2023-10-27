package com.example.spielplatz1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@SpringBootApplication
@Controller
public class SpielPlatz1Application {

    public static void main(String[] args) {
        SpringApplication.run(SpielPlatz1Application.class, args);
    }

    @GetMapping ("/")
    public String getHello() {
    	return "Hello"; // returns the html file
    }

    @GetMapping ("/password")
    public String getPasswordFrom() {
        return "Password";
    }
    @PostMapping("/password")
    public String postPasswordForm(@RequestParam int length, Model model) {
        System.out.println(length);
        model.addAttribute("length", length);
        model.addAttribute("password", generateRandomPassword(length));
        return "Password";
    }

    private String generateRandomPassword(int length) {
        // Add your password generation logic here
        // For simplicity, this example generates a random password of the given length
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder password = new StringBuilder();

        for (int i = 0; i < length; i++) {
            int index = (int) (Math.random() * characters.length());
            password.append(characters.charAt(index));
        }

        return password.toString();
    }

    @GetMapping ("/newsletter")
    public String getNewsletter() {
        return "newsLetter";
    }

    @PostMapping("/newsletter")
    public String postPasswordForm(@RequestParam String email, Model model) {

        model.addAttribute("Erfolg", true);
        return "newsLetter";
    }
}