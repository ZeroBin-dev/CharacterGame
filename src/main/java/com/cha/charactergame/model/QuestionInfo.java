package com.cha.charactergame.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class QuestionInfo {
  private String questionId;
  private String menuId;
  private String imagePath;
  private String correctAnswer;
  private int difficulty;
}
