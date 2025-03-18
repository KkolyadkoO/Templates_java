package com.lab3.task1;

public class LevelBuilder {
    private Level level;

    public LevelBuilder() {
        level = new Level();
    }

    public void reset(){
        level = new Level();
    }

    public LevelBuilder setDifficulty(String difficulty) {
        level.setDifficulty(difficulty);
        return this;
    }

    public LevelBuilder addObstacle(String obstacle) {
        level.addObstacle(obstacle);
        return this;
    }

    public LevelBuilder addMonster(String monster) {
        level.addMonster(monster);
        return this;
    }

    public Level build() {
        return level;
    }
}
