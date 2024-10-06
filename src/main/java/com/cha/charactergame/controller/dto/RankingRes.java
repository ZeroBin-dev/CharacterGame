package com.cha.charactergame.controller.dto;

import com.cha.charactergame.model.RankingInfo;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class RankingRes {
  List<RankingInfo> list;
}
