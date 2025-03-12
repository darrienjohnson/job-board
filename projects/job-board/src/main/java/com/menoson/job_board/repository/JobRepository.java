package com.menoson.job_board.repository;

import com.menoson.job_board.entity.Job;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobRepository extends JpaRepository<Job, Long> {
}
