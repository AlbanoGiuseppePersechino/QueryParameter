package com.example.demo_webapp;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1")

public class CiaoController {

    @GetMapping(path = "/ciao")
    public String ciao (@RequestParam String nome, @RequestParam String provincia) {
        return "Ciao " + nome + ", com'è il tempo in " + provincia + "?";
    }
}