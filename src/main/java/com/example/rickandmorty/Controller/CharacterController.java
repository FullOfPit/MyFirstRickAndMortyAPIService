package com.example.rickandmorty.Controller;

import com.example.rickandmorty.model.Character;
import com.example.rickandmorty.service.WebClientService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/RickAndMorty")
public class CharacterController {

    WebClientService webClientService = new WebClientService();

    @GetMapping("/character")
    public List<Character> getAllCharacters() {
        return webClientService.getAllCharacters();
    }

    @GetMapping("/character?status=alive")
    public List<Character> getAllCharactersAlive() {
        return webClientService.somethingElse();
    }

}
