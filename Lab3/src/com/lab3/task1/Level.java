package com.lab3.task1;

import java.util.ArrayList;
import java.util.List;

public class Level {
    private List<String> obstacles;
    private List<String> monsters;
    private String difficulty;

    public Level() {
        obstacles = new ArrayList<>();
        monsters = new ArrayList<>();
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    public void addObstacle(String obstacle) {
        obstacles.add(obstacle);
    }

    public void addMonster(String monster) {
        monsters.add(monster);
    }

    @Override
    public String toString() {
        return "Level{" +
                "difficulty='" + difficulty + '\'' +
                ", obstacles=" + obstacles +
                ", monsters=" + monsters +
                '}';
    }
}
