package com.lab3.task1;

public class main {
    public static void main(String[] args) {
        var levelB = new LevelBuilder()
                .setDifficulty("Hard")
                .addObstacle("Spikes")
                .addObstacle("Lava");
        levelB.reset();
        var level = levelB.addMonster("Dragon")
                .addMonster("Goblin")
                .build();

        System.out.println(level);
    }
}
