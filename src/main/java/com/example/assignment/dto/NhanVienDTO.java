package com.example.assignment.dto;

import com.example.assignment.entity.ChucVu;
import com.example.assignment.entity.CuaHang;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class NhanVienDTO {
    private Integer id ;

    private String ma ;

    private String hoTen;

    private String gioiTinh;

    private Date ngaySinh;

    private String diaChi;

    private String matKhau;

    private Integer trangThai ;

    private CuaHangDTO cuaHang ;

    private ChucVuDTO chucVu ;
}
