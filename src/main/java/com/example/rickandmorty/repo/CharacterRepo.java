package com.example.rickandmorty.repo;

import com.example.rickandmorty.model.InfoClass;
import com.example.rickandmorty.model.Character;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Repository
public class CharacterRepo {
    private InfoClass info;
    private List<Character> results = new ArrayList<>();

    public List<Character> getAllCharacters() {
        return this.results;
    }

    public List<Character> getAllCharactersAlive(){
        return this.results;
    }
}
