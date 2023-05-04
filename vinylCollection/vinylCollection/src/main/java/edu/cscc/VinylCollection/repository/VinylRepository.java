package edu.cscc.VinylCollection.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import edu.cscc.VinylCollection.model.Record;

	@Repository
	public interface VinylRepository extends CrudRepository<Record, Long> {}