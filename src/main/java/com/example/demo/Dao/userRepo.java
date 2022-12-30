package com.example.demo.Dao;

import com.example.demo.POJO.TableUser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface userRepo extends JpaRepository<TableUser,Long> {

    public List<TableUser> findByName(String name);


}
