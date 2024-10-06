package com.cha.charactergame.service;

import com.cha.charactergame.controller.dto.BaseUpdateResponse;
import com.cha.charactergame.controller.dto.RankingRes;
import com.cha.charactergame.dao.QuestionDAO;
import com.cha.charactergame.model.MenuInfo;
import com.cha.charactergame.model.QuestionInfo;
import com.cha.charactergame.model.RankingInfo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class QuestionService {

  private final QuestionDAO questionDAO;

  public List<MenuInfo> getMenuList() {
    return questionDAO.selectMenuList();
  }

  public MenuInfo getMenuInfo(final String menuId) {
    return questionDAO.selectMenuOne(menuId);
  }

  public List<QuestionInfo> getQuestionList(final String menuId) {
    return questionDAO.selectQuestionList(menuId);
  }

  public List<QuestionInfo> getRandomQuestionList(final String menuId, final int count) {
    return questionDAO.selectRandomQuestionList(menuId, count);
  }

  public BaseUpdateResponse setRanking(RankingInfo rankingInfo) {
    questionDAO.insertRanking(rankingInfo);
    return new BaseUpdateResponse();
  }

  public RankingRes getRankingList(RankingInfo rankingInfo) {
    return new RankingRes(questionDAO.selectRankList(rankingInfo.getMenuId()));
  }

}


