package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.sql.DataSource;
import java.sql.Connection;

@Controller
public class HelloController {

    @Autowired
    private DataSource dataSource;

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("status", "Project Initialized Correctly 100%");
        
        boolean dbConnected = false;
        try (Connection conn = dataSource.getConnection()) {
            dbConnected = !conn.isClosed();
        } catch (Exception e) {
            // Log or handle error if needed
        }
        
        model.addAttribute("dbConnected", dbConnected ? "Connected Successfully 🟢" : "Connecting... 🔴");
        return "home";
    }
}
