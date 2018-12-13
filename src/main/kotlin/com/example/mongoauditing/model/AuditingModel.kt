package com.example.mongoauditing.model

import org.springframework.data.annotation.Id
import org.springframework.data.annotation.LastModifiedDate
import org.springframework.data.mongodb.core.mapping.Document
import org.springframework.data.mongodb.core.mapping.Field
import java.time.Instant

@Document(collection = "auditing_model")
data class AuditingModel(

    @Field("model_id")
    val modelId: String,

    @Field("created_at")
    val createdAt: Instant = Instant.now(),

    @LastModifiedDate
    @Field("updated_at")
    val updatedAt: Instant = Instant.now(),

    @Id private val id: String? = null
)
