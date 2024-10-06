package com.cha.charactergame.controller;

import com.cha.charactergame.controller.dto.AdminAnswerRequest;
import com.cha.charactergame.controller.dto.AdminMenuRequest;
import com.cha.charactergame.controller.dto.BaseUpdateResponse;
import com.cha.charactergame.service.AdminService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
@RequiredArgsConstructor
public class AdminController {

  private final AdminService adminService;

  // 정답 등록
  @PostMapping("/answer")
  public BaseUpdateResponse registerAnswer(@RequestBody AdminAnswerRequest param) {
    return adminService.registerAnswer(param);
  }

  // 정답 삭제
  @PostMapping("/answer/delete")
  public BaseUpdateResponse deleteAnswer(@RequestBody AdminAnswerRequest param) {
    return adminService.deleteAnswer(param);
  }

  // 메뉴 등록
  @PostMapping("/menu")
  public BaseUpdateResponse registerMenu(@RequestBody AdminMenuRequest param) {
    return adminService.registerMenu(param);
  }

  // 메뉴 삭제
  @PostMapping("/menu/delete")
  public BaseUpdateResponse deleteAnswer(@RequestBody AdminMenuRequest param) {
    return adminService.deleteMenu(param);
  }

}
