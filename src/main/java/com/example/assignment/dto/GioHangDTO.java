package com.example.assignment.dto;

import com.example.assignment.entity.KhachHang;
import com.example.assignment.entity.NhanVien;
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
public class GioHangDTO {
    private Integer id;

    private String ma;

    private Date ngayThanhToan;

    private Integer tinhTrang;

    private String tenNguoiNhan;

    private String diaChi;

    private String sdt;

    private NhanVienDTO nhanVien;

    private KhachHangDTO khachHang;
}
