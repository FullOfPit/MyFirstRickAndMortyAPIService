package com.example.rickandmorty.service;

import com.example.rickandmorty.model.Character;
import com.example.rickandmorty.repo.CharacterRepo;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;

@Service
public class WebClientService {

    public CharacterRepo characterRepo;

    public List<Character> getAllCharacters() {
        this.getAllCharactersFromAPI();
        return this.characterRepo.getAllCharacters();
    }

    public List<Character> somethingElse() {
        this.getAllLivingCharacter();
        return this.characterRepo.getAllCharactersAlive();
    }

    public void getAllCharactersFromAPI() {
        WebClient webClient = WebClient.create("https://rickandmortyapi.com/api");

        CharacterRepo response = webClient.get()
                .uri("/character")
                .header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                .retrieve()
                .toEntity(CharacterRepo.class)
                .block()
                .getBody();

        this.characterRepo = response;

    }

    public void getAllLivingCharacter() {
        WebClient webClient = WebClient.create("https://rickandmortyapi.com/api");

        CharacterRepo response = webClient.get()
                .uri("/character?status=alive")
                .header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                .retrieve()
                .toEntity(CharacterRepo.class)
                .block()
                .getBody();
        this.characterRepo = response;
    }
}
