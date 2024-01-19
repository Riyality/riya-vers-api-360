package com.riyavers.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.riyavers.entity.Branch;

@Repository
public interface BranchRepository extends CrudRepository<Branch, Integer> {

}
