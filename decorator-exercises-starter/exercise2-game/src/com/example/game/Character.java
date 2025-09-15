package com.example.game;

public interface Character {
    void move();
    void attack();
    int getSpeed();
    int getDamage();
    String getSprite();
}
