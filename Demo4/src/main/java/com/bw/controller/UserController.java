/**
 * <br>包描述:TODO
 * <br>创建日期:2019年11月6日
 */
package com.bw.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bw.bean.User;
import com.bw.service.UserService;

/**
 * <br>类型标题:TODO
 * <br>类型描述:TODO
 * <br>创建日期:2019年11月6日
 */
@Controller
public class UserController {

  @Autowired
  private UserService service;

  @RequestMapping("getList.do")
  public String getList(Model model) {
    List<User> list = service.getList();
    model.addAttribute("list", list);
    return "show";
  }
}
