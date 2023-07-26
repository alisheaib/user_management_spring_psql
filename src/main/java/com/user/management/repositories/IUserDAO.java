package com.user.management.repositories;


import com.user.management.entities.UserVO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IUserDAO extends JpaRepository<UserVO, String>, JpaSpecificationExecutor<UserVO> {
    Optional<UserVO> findByIdUser(String idUser);
}
