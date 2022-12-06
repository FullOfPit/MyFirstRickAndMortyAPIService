package com.example.rickandmorty.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class InfoClass {
    private String count;
    private String pages;
    private String next;
    private String prev;
}
