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

  @GetMapping(value = {"/", "/index", "/main"})
  public String index(Model model) throws Exception {
    model.addAttribute("list", questionService.getMenuList());
    return "index";
  }

  @GetMapping("/start-game/{menuId}")
  public String game(@PathVariable String menuId, Model model) throws Exception {
    model.addAttribute("list", questionService.getQuestionList(menuId));
    return "view/game";
  }

}
