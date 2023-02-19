package com.example.assignment.service;

import com.example.assignment.dto.HoaDonChiTietDTO;
import com.example.assignment.dto.HoaDonDTO;
import com.example.assignment.entity.HoaDonChiTiet;

import java.util.List;

public interface HoaDonCTService {
    public HoaDonChiTietDTO findById(Integer id);
    List<HoaDonChiTietDTO> getAll();
    List<HoaDonChiTietDTO> searchHoaDon(String name  , Integer status);
    List<HoaDonChiTietDTO> searchHoaDonbyStatus( Integer status);

}
