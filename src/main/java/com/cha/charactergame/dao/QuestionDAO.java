package com.cha.charactergame.dao;

import com.cha.charactergame.controller.dto.AdminAnswerRequest;
import com.cha.charactergame.controller.dto.AdminMenuRequest;
import com.cha.charactergame.model.MenuInfo;
import com.cha.charactergame.model.QuestionInfo;
import com.cha.charactergame.model.RankingInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface QuestionDAO {
  List<MenuInfo> selectMenuList();

  MenuInfo selectMenuOne(String menuId);

  List<QuestionInfo> selectQuestionList(String menuId);

  List<QuestionInfo> selectRandomQuestionList(@Param("menuId") String menuId, @Param("count") int count);

  void insertRanking(RankingInfo rankingInfo);

  List<RankingInfo> selectRankList(String menuId);

  void insertQuestion(AdminAnswerRequest param);

  String selectMaxQuestionId();
  String selectMaxMenuId();

  void insertMenu(AdminMenuRequest param);

  void deleteQuestionId(String qId);

  void deleteMenuId(String menuId);

  void deleteQuestionMenuId(String menuId);
}
