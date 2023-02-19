package com.example.assignment.reponsitory;

import com.example.assignment.entity.HoaDon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface HoaDonRepository extends JpaRepository<HoaDon, Integer> {

    @Query( value = "select h from HoaDon h where (:name is null or h.ma = :name) or (:name is null or h.nhanVien.ma = :name) or (:name is null or h.khachHang.ma = :name) " +
            "and (:status is null or h.tinhTrang = :status)")
    List<HoaDon> findHoaDonBy(@Param("name") String name,@Param("status") Integer status);
}
