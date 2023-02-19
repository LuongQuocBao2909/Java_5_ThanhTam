package com.example.assignment.reponsitory;

import com.example.assignment.entity.NhanVien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NhanVienRepository  extends JpaRepository<NhanVien,Integer> {
}
