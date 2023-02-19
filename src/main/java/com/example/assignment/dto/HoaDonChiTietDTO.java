package com.example.assignment.dto;

import com.example.assignment.entity.ChiTietSanPham;
import com.example.assignment.entity.HoaDon;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class HoaDonChiTietDTO {
    private Integer id ;

    private Integer soLuong ;

    private double donGia ;

    private HoaDonDTO hoaDon ;

    private ChiTietSanPhamDTO chiTietSanPham ;
}
