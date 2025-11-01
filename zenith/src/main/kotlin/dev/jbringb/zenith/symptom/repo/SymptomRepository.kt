package dev.jbringb.zenith.symptom.repo

import dev.jbringb.zenith.symptom.db_model.Symptom
import org.springframework.data.r2dbc.repository.R2dbcRepository
import org.springframework.data.repository.reactive.ReactiveCrudRepository
import org.springframework.stereotype.Repository

@Repository
interface SymptomRepository : R2dbcRepository<Symptom, Long>