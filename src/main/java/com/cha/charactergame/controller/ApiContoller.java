package com.cha.charactergame.controller;

import com.cha.charactergame.controller.dto.BaseUpdateResponse;
import com.cha.charactergame.controller.dto.RankingRes;
import com.cha.charactergame.model.RankingInfo;
import com.cha.charactergame.service.QuestionService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ApiContoller {

  private final QuestionService questionService;

  @ResponseBody
  @PostMapping("/insert/rank")
  public BaseUpdateResponse inserRank(@RequestBody RankingInfo rankingInfo) {
    return questionService.setRanking(rankingInfo);
  }

  @ResponseBody
  @PostMapping("/select/rank")
  public RankingRes selectRank(@RequestBody RankingInfo rankingInfo){
    return questionService.getRankingList(rankingInfo);
  }

}
