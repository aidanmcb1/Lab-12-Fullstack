package edu.cscc.VinylCollection.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import edu.cscc.VinylCollection.model.NewRecord;
import edu.cscc.VinylCollection.model.Record;
import edu.cscc.VinylCollection.repository.VinylRepository;



@Controller
public class RecordController {
	@Autowired
	private VinylRepository repository;
	
	@GetMapping("/records")
	public String getRecords(Model model) {
		var allrecords = repository.findAll();
		model.addAttribute("records", allrecords);
		return "records";
	}
	
	@GetMapping("/records/{id}")
	public String getRecord(@PathVariable long id, Model model) {
		var record = repository.findById(id);
		model.addAttribute("record", record.get());
		return "record";
	}
	
	@GetMapping("/add-record")
	public String getRecordForm(Model model) {
		model.addAttribute("recordrequest", new Record());
		return "add-record";
	}
	
	@PostMapping("/add-record")
	public String addRecord(NewRecord recordrequest, Model model) {
		System.out.println(recordrequest);
		model.addAttribute("record", recordrequest);
		return "record-add-success";
	}
}
