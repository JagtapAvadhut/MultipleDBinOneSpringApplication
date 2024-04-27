package com.SpringDb.mysql.repository;

import com.SpringDb.mysql.entites.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Long> {

}
