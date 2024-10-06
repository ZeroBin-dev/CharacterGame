package com.cha.charactergame.service;

import com.cha.charactergame.controller.dto.AdminAnswerRequest;
import com.cha.charactergame.controller.dto.AdminMenuRequest;
import com.cha.charactergame.controller.dto.BaseUpdateResponse;
import com.cha.charactergame.dao.QuestionDAO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AdminService {

  private final QuestionDAO questionDAO;

  /**
   * 정답 등록
   */
  public BaseUpdateResponse registerAnswer(AdminAnswerRequest param) {
    param.setQuestionId(getMaxQuestionId("question"));
    questionDAO.insertQuestion(param);
    return new BaseUpdateResponse();
  }

  public BaseUpdateResponse registerMenu(AdminMenuRequest param) {
    param.setMenuId(getMaxQuestionId("menu"));
    questionDAO.insertMenu(param);
    return new BaseUpdateResponse();
  }

  private String getMaxQuestionId(String type) {
    String maxId = "";

    if ("question".equals(type)) {
      maxId = questionDAO.selectMaxQuestionId();
    } else if ("menu".equals(type)) {
      maxId = questionDAO.selectMaxMenuId();
    }

    // ID에서 숫자 부분 추출
    String prefix = maxId.replaceAll("[0-9]", "");
    int number = Integer.parseInt(maxId.replaceAll("[^0-9]", "")); // 숫자만 추출

    // 새로운 ID 생성
    String newId = prefix + String.format("%03d", number + 1); // 3자리 숫자로 패딩
    return newId;
  }

  public BaseUpdateResponse deleteAnswer(AdminAnswerRequest param) {
    questionDAO.deleteQuestionId(param.getQuestionId());
    return new BaseUpdateResponse();
  }

  public BaseUpdateResponse deleteMenu(AdminMenuRequest param) {
    questionDAO.deleteMenuId(param.getMenuId());
    questionDAO.deleteQuestionMenuId(param.getMenuId());
    return new BaseUpdateResponse();
  }
}
