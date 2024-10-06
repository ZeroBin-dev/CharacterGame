package com.cha.charactergame.controller;

import com.cha.charactergame.service.QuestionService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
@RequiredArgsConstructor
public class ViewController {

  private final QuestionService questionService;

  /**
   * 게임선택
   */
  @GetMapping(value = {"/", "/index", "/main"})
  public String index(Model model) {
    model.addAttribute("list", questionService.getMenuList());
    return "index";
  }

  /**
   * 공부하기
   */
  @GetMapping("/study/{menuId}")
  public String study(@PathVariable String menuId, Model model) {
    model.addAttribute("list", questionService.getQuestionList(menuId));
    model.addAttribute("info", questionService.getMenuInfo(menuId));
    return "view/study";
  }

  /**
   * 모드선택
   */
  @GetMapping("/start-game/{menuId}")
  public String game(@PathVariable String menuId, Model model) {
    model.addAttribute("info", questionService.getMenuInfo(menuId));
    return "view/gameIndex";
  }

  /**
   * 일반모드
   */
  @GetMapping("/start-game/{menuId}/{mode}")
  public String normal(@PathVariable String menuId, @PathVariable String mode, Model model) {
    boolean isDeathMatch = false;
    int questionCount = 0;
    if (mode.equals("normal10")) {
      questionCount = 10;
    } else if (mode.equals("normal20")) {
      questionCount = 20;
    } else if (mode.equals("normal50")) {
      questionCount = 50;
    } else if (mode.equals("death")) {
      questionCount = 20;
      isDeathMatch = true;
    }

    model.addAttribute("list", questionService.getRandomQuestionList(menuId, questionCount));
    model.addAttribute("info", questionService.getMenuInfo(menuId));
    model.addAttribute("isDeathMatch", isDeathMatch);
    model.addAttribute("questionCount", questionCount);

    return "view/gameMode";
  }

  @GetMapping({"/ranking", "/ranking/{menuId}"})
  public String ranking(@PathVariable(required = false) String menuId, Model model) {
    model.addAttribute("menuList", questionService.getMenuList());
    return "view/ranking";
  }

  @GetMapping("/admin")
  public String admin(Model model) {
    model.addAttribute("menuList", questionService.getMenuList());
    return "view/admin";
  }

}
