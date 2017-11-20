package com.pancy.bookmanagement.dao;

import com.pancy.bookmanagement.entity.Student;

public interface StudentDao {
    Student queryStudent(long studentId, long password);
}
