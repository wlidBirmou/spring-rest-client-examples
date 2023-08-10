package guru.springframework.springrestclientexamples.controllers;

import guru.springframework.springrestclientexamples.services.ApiService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@AllArgsConstructor
@Slf4j
@RequestMapping("/users")
@Controller
public class UserController {

    ApiService apiService;

    @GetMapping({"/",""})
    public String getUsers(Model model){
        System.out.println("get users called");
        model.addAttribute("users",this.apiService.getUsers());
        return "userlist";
    }
}
