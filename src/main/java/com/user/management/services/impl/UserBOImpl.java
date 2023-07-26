package com.user.management.services.impl;

import com.user.management.entities.UserVO;
import com.user.management.models.PageListingResponseDTO;
import com.user.management.repositories.IUserDAO;
import com.user.management.services.IUserBO;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserBOImpl implements IUserBO {
    private final IUserDAO userDAO;

    @Override
    public void addUser(List<UserVO> userVOList) {

    }

    @Override
    public PageListingResponseDTO getAllUser(int page, int size) {
        Pageable pageable = PageRequest.of(page, size);
        Page<UserVO> userVOPage = null;
        userVOPage = userDAO.findAll(pageable);
        PageListingResponseDTO pageListingResponseDTO = new PageListingResponseDTO();
        pageListingResponseDTO.setCurrentPage(userVOPage.getNumber() + 1);
        pageListingResponseDTO.setTotalItemsInPage(userVOPage.getNumberOfElements());
        pageListingResponseDTO.setTotalItems(userVOPage.getTotalElements());
        pageListingResponseDTO.setTotalPages(userVOPage.getTotalPages());
        pageListingResponseDTO.setMessage("Retrieved all users");
        pageListingResponseDTO.setStatus("200");
        pageListingResponseDTO.setTimeStamp(new Date());
        return pageListingResponseDTO;
    }

    public List<UserVO> getAll(){
        return userDAO.findAll();
    }

    @Override
    public Optional<UserVO> getByUserId(String id) {
        return userDAO.findByIdUser(id);
    }

}
