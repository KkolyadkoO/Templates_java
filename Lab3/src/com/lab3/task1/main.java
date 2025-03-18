package com.lab3.task1;

public class main {
    public static void main(String[] args) {
        Level level = new LevelBuilder()
                .setDifficulty("Hard")
                .addObstacle("Spikes")
                .addObstacle("Lava")
                .addMonster("Dragon")
                .addMonster("Goblin")
                .build();

        System.out.println(level);
    }
}
