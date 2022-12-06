package com.example.rickandmorty.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
public class Character {
    private int id;
    private String name;
    private String status;
    private String species;
    private String type;
    private String gender;
    private CharacterOrigin origin = new CharacterOrigin();
    private CharacterLocation location = new CharacterLocation();
    private String image;
    private List<String> episode;
    private String url;
    private String created;
}
