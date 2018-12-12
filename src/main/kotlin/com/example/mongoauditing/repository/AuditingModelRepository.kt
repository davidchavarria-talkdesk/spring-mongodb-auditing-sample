package com.example.mongoauditing.repository

import com.example.mongoauditing.model.AuditingModel
import org.springframework.data.repository.CrudRepository

interface AuditingModelRepository : CrudRepository<AuditingModel, String> {

    fun findByModelId(modelId: String): AuditingModel?
}
