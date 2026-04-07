package com.app.controller;

import com.app.model.JobPost;
import com.app.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@Controller
@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class JobController {

    @Autowired
    private JobService service;

    @GetMapping("/jobPosts")
    //@ResponseBody
    public List<JobPost> getAllJobs() {
        return service.getAllJobs();
    }

    @GetMapping("/jobPost/{postId}")
    public JobPost getJob(@PathVariable int postId) {
        return service.getJob(postId);
    }

    @PostMapping("/jobPost")
    public JobPost saveJob(@RequestBody JobPost jobPost) {
        service.saveJob(jobPost);
        return service.getJob(jobPost.getPostId());
    }
}
