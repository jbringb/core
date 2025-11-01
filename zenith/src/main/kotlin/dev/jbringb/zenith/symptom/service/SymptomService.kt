package dev.jbringb.zenith.symptom.service

import dev.jbringb.zenith.symptom.api_model.CreateSymptomRq
import dev.jbringb.zenith.symptom.repo.SymptomRepository
import org.springframework.stereotype.Service

@Service
class SymptomService(repository: SymptomRepository) {
    private val repo = repository

    fun getAllSymptoms() = repo.findAll()

    fun getSymptomById(id: Long) = repo.findById(id)

    fun save(rq: CreateSymptomRq) = repo.save(rq.toDb())

    fun deleteById(id: Long) = repo.deleteById(id)
}