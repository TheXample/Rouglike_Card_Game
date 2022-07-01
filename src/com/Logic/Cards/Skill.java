package com.Logic.Cards;

public interface Skill {

    String getName();

    String getDescription();

    int[] calculate(int[] input);

    Type getSkillType();

    DamageType getDamageType();
}
