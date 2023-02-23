//package com.example.StudentExample.Service;
//
//public class StdentService {
//
//}
package com.example.demo.StudentExample.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.StudentExample.Entity.StudentEntity;
import com.example.demo.StudentExample.Repository.StudentRepo;

@Service
public class StudentService 

{
	@Autowired(required=true)
	StudentRepo stRepo;
	
	public StudentEntity saveDetails(StudentEntity e)
	{
		return stRepo.save(e);
	}

}
