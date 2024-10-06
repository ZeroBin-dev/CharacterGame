package com.cha.charactergame.controller.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AdminAnswerRequest {
  private String questionId;
  private String menuId;
  private String correctAnswer;
  private String imagePath;
}
