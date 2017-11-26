package com.pancy.bookmanagement.dao;

import com.pancy.bookmanagement.entity.Student;
import org.apache.ibatis.annotations.Param;

public interface StudentDao {
    Student queryStudent(@Param("studentId") long studentId, @Param("password") long password);
}
