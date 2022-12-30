package com.example.demo;

import com.example.demo.Dao.userRepo;
import com.example.demo.POJO.TableUser;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class Demo5Application {

    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(Demo5Application.class, args);
        userRepo repo = applicationContext.getBean(userRepo.class);


        TableUser user1 = new TableUser();
        user1.setName("pratik");
        user1.setSalary(500);

        TableUser user2 = new TableUser();
        user2.setName("ram");
        user2.setSalary(800);

        /*TableUser user1=repo.save(user);
        System.out.println(user1);*/

       /* List<TableUser> list= List.of(user1,user2);
       Iterable<TableUser> tableUsers= repo.saveAll(list);
       tableUsers.forEach(user->{
           System.out.println(user);

       });*/

        //update user
/*        Optional<TableUser> optional = repo.findById(1L);
        TableUser user = optional.get();
        user.setName("ankit");
        repo.save(user);
        System.out.println(user);*/

        //get all data
      /*  Iterable<TableUser> iterable=repo.findAll();
        iterable.forEach(user->{
            System.out.println(user);
        });*/


      /* repo.deleteById(1L);
       System.out.println("user is deleted ");
       Iterable<TableUser>tableUsers= repo.findAll();
       tableUsers.forEach(user->{
           System.out.println(user);
       });*/

        //find the user using name create on method select * from table_name where name="your name"
     List<TableUser> list= repo.findByName("pratik");
     list.forEach(user->{
         System.out.println(user);
     });


    }

}
