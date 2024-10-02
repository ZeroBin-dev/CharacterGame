package com.cha.charactergame.dao;

import com.cha.charactergame.model.MenuInfo;
import com.cha.charactergame.model.QuestionInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface QuestionDAO {
  List<MenuInfo> selectMenuList();

  List<QuestionInfo> selectQuestionList(String menuId);
}
