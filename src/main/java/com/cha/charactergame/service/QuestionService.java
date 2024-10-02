package com.cha.charactergame.service;

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

  public void setRanking(RankingInfo rankingInfo){
    questionDAO.insertRanking(rankingInfo);
  }

//  public List<RankingInfo> getRankingList(){
//    return
//  }

}


