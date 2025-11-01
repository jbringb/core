package dev.jbringb.zenith.symptom.api_model

import dev.jbringb.zenith.symptom.db_model.Symptom

data class CreateSymptomRq(
    val name: String,
    val description: String? = null,
) {
    fun toDb(): Symptom {
        return Symptom(
            name = name,
            description = description,
        )
    }
}
