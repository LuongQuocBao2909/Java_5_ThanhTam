package com.example.assignment.reponsitory;

import com.example.assignment.entity.DongSanPham;
import com.example.assignment.entity.GioHangChiTiet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GioHangCTRepository  extends JpaRepository<GioHangChiTiet,Integer> {
}
