package com.example.demo.Dao;

import com.example.demo.POJO.TableUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface userRepo extends JpaRepository<TableUser,Long> {


}
