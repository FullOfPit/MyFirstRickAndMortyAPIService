package com.example.rickandmorty;

import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class RickAndMortyApplicationTests {
    /*
    @Test
    CharacterRepo getAllCharacters() {
        WebClient webClient = WebClient.create("https://rickandmortyapi.com/api");

        CharacterRepo response = webClient.get()
                .uri("/character")
                .header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                .retrieve()
                .toEntity(CharacterRepo.class)
                .block()
                .getBody();

        System.out.println(response.toString());

        Assertions.assertTrue(true);
        return response;


     */
}

