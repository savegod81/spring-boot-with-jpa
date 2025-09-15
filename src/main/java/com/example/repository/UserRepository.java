package com.example.repository;

import com.example.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.query.QueryByExampleExecutor;
import org.springframework.stereotype.Repository;

/**
 * Author Yandong
 *
 * @Date 2025-09-15
 */
@Repository
public interface UserRepository extends
        JpaRepository<Users, Long>,
        QueryByExampleExecutor<Users>,
        JpaSpecificationExecutor<Users> {
}
