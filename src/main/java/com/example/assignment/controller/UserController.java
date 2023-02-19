package com.example.assignment.controller;

import com.example.assignment.dto.UserDTO;
import com.example.assignment.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/dangki")
    public String dangki(Model model) {
        model.addAttribute("view", "taikhoan/dangki.jsp");
        model.addAttribute("userDTO", new UserDTO());
        return "page/index";
    }

    @GetMapping("/dangnhap")
    public String dangnhap(Model model) {
        model.addAttribute("view", "taikhoan/dangnhap.jsp");
        return "page/index";
    }

    @PostMapping("/dangki/store")
    public String store(Model model, @Valid @ModelAttribute("userDTO") UserDTO userDTO, BindingResult result) {
        if(result.hasErrors()){
            model.addAttribute("view", "taikhoan/dangki.jsp");
            model.addAttribute("userDTO", new UserDTO());
            return "page/index";
        }else {
            userService.add(userDTO);
            return "redirect:/dangnhap";
        }
    }
}
