package com.edu.miu.cs.cs425.studenmgmt.model.repository;

import com.edu.miu.cs.cs425.studenmgmt.model.model.Transcript;
import org.springframework.data.jpa.repository.JpaRepository;


public interface TranscriptRepository extends JpaRepository <Transcript, Long>{
}
