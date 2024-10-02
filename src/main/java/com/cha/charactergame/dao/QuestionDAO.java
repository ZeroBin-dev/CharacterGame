package com.cha.charactergame.dao;

import com.cha.charactergame.model.MenuInfo;
import com.cha.charactergame.model.QuestionInfo;
import com.cha.charactergame.model.RankingInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface QuestionDAO {
  List<MenuInfo> selectMenuList();

  MenuInfo selectMenuOne(String menuId);

  List<QuestionInfo> selectQuestionList(String menuId);

  void insertRanking(RankingInfo rankingInfo);
}
