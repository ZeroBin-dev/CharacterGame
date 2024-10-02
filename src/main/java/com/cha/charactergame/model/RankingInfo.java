package com.cha.charactergame.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RankingInfo {
  private String playerName;
  private String menuId;
  private int score;
  private int playTime;
  private String playDate;
}
