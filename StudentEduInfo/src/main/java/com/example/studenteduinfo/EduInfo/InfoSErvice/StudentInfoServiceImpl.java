package com.example.studenteduinfo.EduInfo.InfoSErvice;

import com.example.studenteduinfo.entity.LearningInfo;
import com.example.studenteduinfo.entity.StudentInfo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service

public class StudentInfoServiceImpl  implements StudentInfoService{
    List<StudentInfo> list;
    public StudentInfoServiceImpl() {
         list = new ArrayList<>();

        list.add(new StudentInfo(54, "Siddhartha", "21", "Class 5-A", "Lh 3/4 Housing colony Chandwa ara"));
        list.add(new StudentInfo(001, "Shreya", "20", "class 5-A", "LH1/2 Housing colony"));
        list.add(new StudentInfo(011, "priyanshi", "24", "class 8-A", "LH3/4 Housing colony"));


    }
    @Override
    public List<StudentInfo> getStudentInfo() {
        return list;
    }




    @Override
    public StudentInfo getStudentInfo(int getStudentInfo) {
        StudentInfo c = null;
        for (StudentInfo studenteachinfo : list) {
            if (studenteachinfo.getId() == getStudentInfo) {
                c = studenteachinfo;
                break;
            }

        }
        return c;
    }

    @Override
    public StudentInfo addStudentInfo(StudentInfo newStudentInfo) {
        list.add(newStudentInfo);
        return newStudentInfo;
    }
}
