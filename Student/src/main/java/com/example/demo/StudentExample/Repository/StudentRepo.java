//package com.example.StudentExample.Repository;
//
//public class StudentRepo {
//
//}
package com.example.demo.StudentExample.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.StudentExample.Entity.StudentEntity;

public interface StudentRepo extends JpaRepository<StudentEntity,Integer>{

}