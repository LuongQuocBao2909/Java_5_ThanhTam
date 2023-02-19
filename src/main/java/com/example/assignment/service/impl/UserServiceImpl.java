package com.example.assignment.service.impl;

import com.example.assignment.dto.UserDTO;
import com.example.assignment.entity.User;
import com.example.assignment.mapper.UserMapper;
import com.example.assignment.reponsitory.UserRepository;
import com.example.assignment.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;

    @Autowired
    UserMapper userMapper;

    @Override
    public UserDTO add(UserDTO userDTO) {
        User user = userMapper.convertToEntity(userDTO);
        user = userRepository.save(user);
        return userMapper.convertToDTO(user);
    }

    @Override
    public UserDTO update(UserDTO userDTO) {
        return null;
    }
}
