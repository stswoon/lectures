package com.netcracker.education.view.user;

import com.netcracker.education.hero.HeroController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserViewController {
    @Autowired
    HeroController heroController;

    @RequestMapping("/user")
    public String user(Model model) {
        model.addAttribute("heroes", heroController.get());
        return "user";
    }

    @RequestMapping("/user-simple")
    public String userSimple(Model model) {
        model.addAttribute("heroes", heroController.get());
        return "user-simple";
    }
}
