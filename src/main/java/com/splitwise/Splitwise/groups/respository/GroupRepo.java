package com.splitwise.Splitwise.groups.respository;

import com.splitwise.Splitwise.groups.entity.Group;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GroupRepo extends JpaRepository<Group,Integer> {
}
