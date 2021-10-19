package com.game.components.entities.text;

import com.game.components.helpers.GameConstants;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.impl.TextEntity;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class ScoreText extends TextEntity {

    private int score = 0;

    public ScoreText() {
        super(new Coordinate2D(0, 0));

        setFont(Font.font("Roboto", FontWeight.BOLD, 30));
        setFill(Color.WHITE);
        setText(GameConstants.SCORE_TXT + score);
    }

    public void incrementScore(int incrementer) {
        score += incrementer;
    }

    public void showScore() {
        setText(GameConstants.SCORE_TXT + score);
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}