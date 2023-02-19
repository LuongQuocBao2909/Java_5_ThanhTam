package com.example.assignment.controller;

import com.example.assignment.dto.ChiTietSanPhamDTO;
import com.example.assignment.entity.ChiTietSanPham;
import com.example.assignment.service.ChiTietSPService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class CTSanPhamController {

    @Autowired
    ChiTietSPService chiTietSPService;

    @GetMapping("/sanpham/detail/{id}")
    public String detail(Model model, @PathVariable("id")Integer id){
        ChiTietSanPhamDTO spDTO = chiTietSPService.findById(id);
        model.addAttribute("view","detail.jsp");
        model.addAttribute("sp",spDTO);
        return "page/index";
    }


}
