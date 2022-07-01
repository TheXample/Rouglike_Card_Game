package com.Logic.Character;

import com.Logic.Cards.Skill;

import java.util.ArrayList;
import java.util.List;

public class Character {

    private String name;

    private List<Skill> deck;

    public Character(String name) {
        this.name = name;
        this. deck = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Skill> getDeck() {
        return deck;
    }

    public void setDeck(List<Skill> deck) {
        this.deck = deck;
    }
}
