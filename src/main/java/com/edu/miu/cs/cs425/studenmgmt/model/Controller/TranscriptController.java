//package com.edu.miu.cs.cs425.studenmgmt.model.Controller;
//
//import com.edu.miu.cs.cs425.studenmgmt.model.Transcript;
//import com.edu.miu.cs.cs425.studenmgmt.model.ServiceImp.TranscriptImp;
//import com.edu.miu.cs.cs425.studenmgmt.model.Exception.TranscriptNotFoundException;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/transcripts")
//public class TranscriptController {
//
//    @Autowired
//    private TranscriptImp transcriptService;
//
//    // Create a new transcript
//    @PostMapping
//    @ResponseStatus(HttpStatus.CREATED)
//    public Transcript createTranscript(@RequestBody Transcript transcript) {
//        try {
//            return transcriptService.saveTranscript(transcript);
//        } catch (Exception e) {
//            throw new RuntimeException("Error creating transcript: " + e.getMessage());
//        }
//    }
//
//    // Retrieve all transcripts
//    @GetMapping
//    public List<Transcript> getAllTranscripts() {
//        return transcriptService.getAllTranscripts();
//    }
//
//    // Retrieve a specific transcript by ID
//    @GetMapping("/{id}")
//    public Transcript getTranscriptById(@PathVariable Long id) {
//        try {
//            return transcriptService.getTranscriptById(id);
//        } catch (TranscriptNotFoundException e) {
//            throw new TranscriptNotFoundException("Transcript not found with ID: " + id);
//        }
//    }
//
//    // Update an existing transcript
//    @PutMapping("/{id}")
//    public Transcript updateTranscript(@PathVariable Long id, @RequestBody Transcript transcript) {
//        transcript.setTranscriptId(id); // Ensure the ID is set for update
//        try {
//            return transcriptService.updateTranscript(transcript, id);
//        } catch (TranscriptNotFoundException e) {
//            throw new TranscriptNotFoundException("Cannot update. Transcript not found with ID: " + id);
//        } catch (Exception e) {
//            throw new RuntimeException("Error updating transcript: " + e.getMessage());
//        }
//    }
//
//    // Delete a transcript by ID
//    @DeleteMapping("/{id}")
//    @ResponseStatus(HttpStatus.NO_CONTENT)
//    public void deleteTranscript(@PathVariable Long id) {
//        try {
//            transcriptService.deleteById(id);
//        } catch (TranscriptNotFoundException e) {
//            throw new TranscriptNotFoundException("Cannot delete. Transcript not found with ID: " + id);
//        } catch (Exception e) {
//            throw new RuntimeException("Error deleting transcript: " + e.getMessage());
//        }
//    }
//}