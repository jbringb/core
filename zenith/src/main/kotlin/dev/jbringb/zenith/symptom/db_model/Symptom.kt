package dev.jbringb.zenith.symptom.db_model

import org.springframework.data.relational.core.mapping.Table

@Table("symptoms")
data class Symptom(
    val id: Long? = null,
    val name: String,
    val description: String? = null,
)