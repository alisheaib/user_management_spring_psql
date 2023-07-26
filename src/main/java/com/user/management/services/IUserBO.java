package com.user.management.services;

import com.user.management.entities.UserVO;
import com.user.management.models.PageListingResponseDTO;

import java.util.List;
import java.util.Optional;

public interface IUserBO {
    void addUser(List<UserVO> userVOList);
    PageListingResponseDTO getAllUser(int page, int size);
    List<UserVO> getAll();
    Optional<UserVO> getByUserId(String id);

}