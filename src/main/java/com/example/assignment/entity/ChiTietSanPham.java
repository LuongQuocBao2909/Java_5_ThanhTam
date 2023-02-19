package com.example.assignment.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "chi_tiet_san_pham")
public class ChiTietSanPham {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id ;

    @Column(name = "nam_bao_hanh")
    private Integer namBaoHanh ;

    @Column(name = "mo_ta")
    private String moTa;

    @Column(name = "so_luong_ton")
    private Integer soLuongTon;

    @Column(name = "gia_nhap")
    private double giaNhap;

    @Column(name = "gia_ban")
    private double giaBan;

    @ManyToOne()
    @JoinColumn(name = "sanpham_id",referencedColumnName = "id")
    private SanPham sanPham ;


    @ManyToOne()
    @JoinColumn(name = "nsx_id",referencedColumnName = "id")
    private NSX nsx ;

    @ManyToOne()
    @JoinColumn(name = "mausac_id",referencedColumnName = "id")
    private MauSac mauSac ;

    @ManyToOne()
    @JoinColumn(name = "dongsanpham_id",referencedColumnName = "id")
    private DongSanPham dongSanPham ;

    @OneToMany(mappedBy = "chiTietSanPham")
    private List<HoaDonChiTiet> hoaDonChiTiets ;

    @OneToMany(mappedBy = "chiTietSanPham")
    private List<GioHangChiTiet> gioHangChiTiets ;
}
