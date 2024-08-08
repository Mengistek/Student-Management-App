package com.edu.miu.cs.cs425.studenmgmt.model.service;

import com.edu.miu.cs.cs425.studenmgmt.model.model.Transcript;
import com.edu.miu.cs.cs425.studenmgmt.model.exception.TranscriptNotFoundException;
import com.edu.miu.cs.cs425.studenmgmt.model.repository.TranscriptRepository;
import com.edu.miu.cs.cs425.studenmgmt.model.service.ServiceImp.TranscriptImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TranscriptService implements TranscriptImp {

    @Autowired
    private TranscriptRepository transcriptRepository;

    @Override
    public List<Transcript> getAllTranscripts() {
        return transcriptRepository.findAll();
    }

    @Override
    public Transcript saveTranscript(Transcript transcript) {
        try {
            return transcriptRepository.save(transcript);
        } catch (DataIntegrityViolationException e) {
            throw new RuntimeException("Error saving transcript: " + e.getMessage());
        }
    }

    @Override
    public Transcript getTranscriptById(Long id) {
        return transcriptRepository.findById(id)
                .orElseThrow(() -> new TranscriptNotFoundException("Transcript not found with ID: " + id));
    }

    @Override
    public Transcript updateTranscript(Transcript transcript, Long id) {
        if (!transcriptRepository.existsById(id)) {
            throw new TranscriptNotFoundException("Cannot update. Transcript not found with ID: " + id);
        }
        transcript.setTranscriptId(id);
        try {
            return transcriptRepository.save(transcript);
        } catch (DataIntegrityViolationException e) {
            throw new RuntimeException("Error updating transcript: " + e.getMessage());
        }
    }

    @Override
    public void deleteById(Long id) {
        try {
            transcriptRepository.deleteById(id);
        } catch (EmptyResultDataAccessException e) {
            throw new TranscriptNotFoundException("Transcript not found with ID: " + id);
        } catch (DataIntegrityViolationException e) {
            throw new RuntimeException("Error deleting transcript: " + e.getMessage());
        }
    }
}