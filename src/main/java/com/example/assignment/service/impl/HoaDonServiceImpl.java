package com.example.assignment.service.impl;

import com.example.assignment.dto.ChiTietSanPhamDTO;
import com.example.assignment.dto.HoaDonChiTietDTO;
import com.example.assignment.dto.HoaDonDTO;
import com.example.assignment.entity.ChiTietSanPham;
import com.example.assignment.entity.HoaDon;
import com.example.assignment.entity.HoaDonChiTiet;
import com.example.assignment.mapper.HoaDonChiTietMapper;
import com.example.assignment.mapper.HoaDonMapper;
import com.example.assignment.reponsitory.HoaDonCTRepository;
import com.example.assignment.reponsitory.HoaDonRepository;
import com.example.assignment.service.HoaDonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class HoaDonServiceImpl implements HoaDonService {
    @Autowired
    HoaDonRepository hoaDonRepository;


    @Autowired
    HoaDonMapper mapper;

    @Override
    public List<HoaDonDTO> getAll() {
        List<HoaDon> list = hoaDonRepository.findAll();
        List<HoaDonDTO> listDTO = new ArrayList<>();
        for (HoaDon hoaDon : list) {
            listDTO.add(mapper.convertToDTO(hoaDon));
        }
        return listDTO;
    }

    @Override
    public Page<HoaDonDTO> getSanPhamDTO(Integer pageNo, Integer size) {
        Pageable pageable = PageRequest.of(pageNo, size);
        Page<HoaDon> data = hoaDonRepository.findAll(pageable);
        return data.map(t -> mapper.convertToDTO(t));
    }

    @Override
    public List<HoaDonDTO> searchHoaDon(String name, Integer status) {
        List<HoaDon> list = hoaDonRepository.findHoaDonBy(name, status);
        List<HoaDonDTO> listDTO = new ArrayList<>();
        for (HoaDon hoaDon : list) {
            listDTO.add(mapper.convertToDTO(hoaDon));
        }
        return listDTO;
    }


}
