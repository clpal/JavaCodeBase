package com.easy.tutorials;

import java.util.ArrayList;
import java.util.List;

public class ForEachDemo1 {
    public static void main(String[] args) {
        List<User> list=new ArrayList();
        list.add(new User(100L,"chhotelalpal","chhotelalpal"));
        list.add(new User(100L,"addi","Aadi"));
        list.add(new User(100L,"anju","anjupal@gmail.com"));
        //list.forEach(System.out::println);
      /*  for ( User user : list){
            System.out.println(user.getEmailId());
            System.out.println(user.getId());
            System.out.println(user.getName());
            System.out.println("****************************");
        }*/
        list.forEach(user ->{
            System.out.println(user.getEmailId());
            System.out.println(user.getId());
            System.out.println(user.getName());
            System.out.println("****************************");
        } );



    }
  
}
