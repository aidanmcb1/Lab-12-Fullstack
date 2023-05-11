package edu.cscc.VinylCollection.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
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
		model.addAttribute("count", (Long)(repository.count()+1));
		System.out.println(model);
		return "add-record";
	}
	
	@PostMapping("/add-record")
	public String addRecord(@Valid @ModelAttribute("recordrequest") Record record, BindingResult bindingResult, Model model) {
		if (bindingResult.hasErrors() == true) {
			model.addAttribute("count", (Long)(repository.count()+1));
			return "add-record";
		}
		var createdRecord = repository.save(record);
		return "redirect:/records/" + createdRecord.id;
	}
}
