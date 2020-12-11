package ch.lalumamesh.notenverwaltung.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("api/ping/")
public class PongService {
    @GetMapping
    public String pong() {
        return "pong";
    }
}
