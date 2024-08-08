package com.edu.miu.cs.cs425.studenmgmt.model.Repositories;

import com.edu.miu.cs.cs425.studenmgmt.model.Transcript;
import org.springframework.data.jpa.repository.JpaRepository;


public interface TranscriptRepository extends JpaRepository <Transcript, Long>{
}
