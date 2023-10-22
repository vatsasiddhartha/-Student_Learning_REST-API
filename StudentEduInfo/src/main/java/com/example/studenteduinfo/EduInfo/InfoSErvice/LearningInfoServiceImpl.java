package com.example.studenteduinfo.EduInfo.InfoSErvice;

import com.example.studenteduinfo.entity.LearningInfo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service

public  class LearningInfoServiceImpl  implements LearningInfoService{
    List<LearningInfo>list2;


    public LearningInfoServiceImpl() {
        list2 = new ArrayList<>();

        list2.add(new LearningInfo(005,"OPREATING SYSTEM","PROCESS SCHEDULING","5*****"));
        list2.add(new LearningInfo(002,"ANDROID DEVLOPMENT","ADDING FUNCYTIONALITY TO FRONTEND","3***"));
        list2.add(new LearningInfo(001,"DATA STRUCTURE","Recursion","2**"));


    }



    @Override


    public List<LearningInfo> getLearningInfo() {
        return list2;
    }

    @Override
    public List<LearningInfo> getList2() {
        return null;
    }


    @Override
    public LearningInfo getLearningInfo(int  getLearningInfo) {
        LearningInfo i = null;
        for (LearningInfo EachLearningInfo : list2) {
            if (EachLearningInfo.getSubjectId()== getLearningInfo) {
                i = EachLearningInfo;
                break;
            }


        }

        return i;
    }

    @Override
    public LearningInfo addLearningInfo(LearningInfo AddedLearningInfo) {
       list2.add(AddedLearningInfo);
       return AddedLearningInfo;
    }


}
