package com.edu.miu.cs.cs425.studenmgmt.model.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
public class Transcript {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private  Long transcriptId;

    private String degreeTitle;

    public Transcript(Long transcriptId, String degreeTitle) {
        this.transcriptId = transcriptId;
        this.degreeTitle = degreeTitle;
    }

    public Long getTranscriptId() {
        return transcriptId;
    }

    public void setTranscriptId(Long transcriptId) {
        this.transcriptId = transcriptId;
    }

    public String getDegreeTitle() {
        return degreeTitle;
    }

    public void setDegreeTitle(String degreeTitle) {
        this.degreeTitle = degreeTitle;
    }
}
