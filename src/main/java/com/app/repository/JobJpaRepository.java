package com.app.repository;

import com.app.model.JobPost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobJpaRepository extends JpaRepository<JobPost, Integer> {

}
