package com.cha.charactergame.controller;

import com.cha.charactergame.model.RankingInfo;
import com.cha.charactergame.service.QuestionService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ApiContoller {

  private final QuestionService questionService;

  @PostMapping("/insert/rank")
  public ResponseEntity<String> inserRank(@RequestBody RankingInfo rankingInfo) {
    questionService.setRanking(rankingInfo);
    return ResponseEntity.ok("성공");
  }

}
