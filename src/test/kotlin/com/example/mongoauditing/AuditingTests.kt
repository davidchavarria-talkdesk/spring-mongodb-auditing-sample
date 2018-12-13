package com.example.mongoauditing

import com.example.mongoauditing.model.AuditingModel
import com.example.mongoauditing.repository.AuditingModelRepository
import org.junit.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner
import java.util.UUID

@RunWith(SpringRunner::class)
@SpringBootTest
class AuditingTests {

    @Autowired private lateinit var auditingModelRepository: AuditingModelRepository

    @Test fun `save - the stored model should have the updated_at attribute updated`() {
        val returnedModel = auditingModelRepository.save(AuditingModel(modelId = UUID.randomUUID().toString()))
        val storedModel = auditingModelRepository.findByModelId(returnedModel.modelId)!!

        assertEquals(returnedModel.updatedAt, storedModel.updatedAt)
    }

    @Test fun `saveAll - the stored model should have the updated_at attribute updated`() {
        val returnedModel = auditingModelRepository.saveAll(
            setOf(AuditingModel(modelId = UUID.randomUUID().toString()))
        ).first()
        val storedModel = auditingModelRepository.findByModelId(returnedModel.modelId)!!

        assertEquals(returnedModel.updatedAt, storedModel.updatedAt)
    }
}
