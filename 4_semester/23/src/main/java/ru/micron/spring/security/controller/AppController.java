package ru.micron.spring.security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AppController {

  @GetMapping("/")
  public ModelAndView main() {
    ModelAndView modelAndView = new ModelAndView();
    modelAndView.setViewName("view_for_employees");
    return modelAndView;
  }

  @GetMapping("/hr_info")
  public ModelAndView getInfoForHR() {
    ModelAndView modelAndView = new ModelAndView();
    modelAndView.setViewName("view_for_hr");
    return modelAndView;
  }

  @GetMapping("/manager_info")
  public ModelAndView getInfoForManagers() {
    ModelAndView modelAndView = new ModelAndView();
    modelAndView.setViewName("view_for_managers");
    return modelAndView;
  }
}
