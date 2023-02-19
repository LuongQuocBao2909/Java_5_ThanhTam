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
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "nhan_vien")
public class NhanVien {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id ;

    @Column(name = "ma")
    private String ma ;

    @Column(name = "ho_ten")
    private String hoTen;

    @Column(name = "gioi_tinh")
    private String gioiTinh;

    @Column(name = "ngay_sinh")
    private Date ngaySinh;

    @Column(name = "dia_chi")
    private String diaChi;

    @Column(name = "mat_khau")
    private String matKhau;

    @Column(name = "trangthai")
    private Integer trangThai ;

    @ManyToOne()
    @JoinColumn(name = "cuahang_id",referencedColumnName = "id")
    private CuaHang cuaHang ;

    @ManyToOne()
    @JoinColumn(name = "chucvu_id",referencedColumnName = "id")
    private ChucVu chucVu ;

    @OneToMany(mappedBy = "nhanVien")
    private List<HoaDon> hoaDons ;

    @OneToMany(mappedBy = "nhanVien")
    private List<GioHang> gioHangs ;

}
