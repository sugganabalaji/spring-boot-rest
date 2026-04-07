package com.app.service;

import com.app.model.JobPost;
import com.app.repository.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {
    @Autowired
    public JobRepo repository;

    // method to add a jobPost
    public void addJob(JobPost jobPost) {
        repository.addJob(jobPost);
    }

    //method to return all JobPosts
    public List<JobPost> getAllJobs() {
        return repository.getAllJobs();
    }

    public JobPost getJob(int postId) {
        return repository.getJob(postId);
    }
}
