package dev.jbringb.zenith.symptom.controller

import dev.jbringb.zenith.symptom.api_model.CreateSymptomRq
import dev.jbringb.zenith.symptom.service.SymptomService
import org.springframework.web.bind.annotation.*

@RestController()
@RequestMapping("/symptoms")
class SymptomController(svc: SymptomService) {
    private val service = svc

    @PostMapping
    fun createSymptom(@RequestBody rq: CreateSymptomRq) = service.save(rq)

    @GetMapping("/{id}")
    fun getSymptomById(@PathVariable id: Long) = service.getSymptomById(id)
}