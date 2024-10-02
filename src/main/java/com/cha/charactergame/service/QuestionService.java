package com.cha.charactergame.service;

import com.cha.charactergame.dao.QuestionDAO;
import com.cha.charactergame.model.MenuInfo;
import com.cha.charactergame.model.QuestionInfo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class QuestionService {

  private final QuestionDAO questionDAO;
  public List<MenuInfo> getMenuList(){
    return questionDAO.selectMenuList();
  }

  public List<QuestionInfo> getQuestionList(final String menuId){
    return questionDAO.selectQuestionList(menuId);
  }


}
