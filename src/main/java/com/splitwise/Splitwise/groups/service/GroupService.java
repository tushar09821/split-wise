package com.splitwise.Splitwise.groups.service;

import com.splitwise.Splitwise.groups.entity.Group;
import com.splitwise.Splitwise.groups.respository.GroupRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GroupService {
       @Autowired
       public GroupRepo groupRepo;

       public Group createGroup(Group g){
           return groupRepo.save(g);
       }
}
