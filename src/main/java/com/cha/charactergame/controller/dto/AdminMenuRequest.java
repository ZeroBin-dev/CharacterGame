package com.cha.charactergame.controller.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AdminMenuRequest {
  private String menuId;
  private String title;
  private String menuImg;
}
