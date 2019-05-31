package com.wzy.boot.maj.domain;


import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,String> {
    User findByIdAndPwd(String id,String pwd);

}
