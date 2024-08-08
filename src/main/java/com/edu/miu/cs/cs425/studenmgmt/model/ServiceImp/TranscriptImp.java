package com.edu.miu.cs.cs425.studenmgmt.model.ServiceImp;

import com.edu.miu.cs.cs425.studenmgmt.model.Transcript;

import java.util.List;

public interface TranscriptImp {
    List<Transcript> getAllTranscripts();

    Transcript saveTranscript(Transcript transcript);
    void deleteById(Long id);

    Transcript updateTranscript(Transcript transcript,Long id);

    Transcript getTranscriptById(Long id);

}
