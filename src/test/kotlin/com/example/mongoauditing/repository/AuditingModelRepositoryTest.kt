package com.example.mongoauditing.repository

import com.example.mongoauditing.model.AuditingModel
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotEquals
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner
import java.util.UUID

@RunWith(SpringRunner::class)
@SpringBootTest
class AuditingModelRepositoryTest {

    @Autowired private lateinit var subject: AuditingModelRepository

    private lateinit var saveAuditingModel: AuditingModel
    private lateinit var saveAllAuditingModel: AuditingModel

    @Before fun setup() {
        saveAuditingModel = subject.save(AuditingModel(modelId = UUID.randomUUID().toString()))
        saveAllAuditingModel = subject.saveAll(setOf(AuditingModel(modelId = UUID.randomUUID().toString()))).first()
    }

    @Test fun `when the instance is stored using the save method should update the updated_at attribute`() {
        val retrievedInstance = subject.findByModelId(saveAuditingModel.modelId)!!

        assertEquals(saveAuditingModel.updatedAt, retrievedInstance.updatedAt)
        assertNotEquals(retrievedInstance.createdAt, retrievedInstance.updatedAt)
    }

    @Test fun `when the instance is stored using the saveAll method should not update the updated_at attribute`() {
        val retrievedInstance = subject.findByModelId(saveAllAuditingModel.modelId)!!

        assertNotEquals(saveAllAuditingModel.updatedAt, retrievedInstance.updatedAt)
        assertEquals(retrievedInstance.createdAt, retrievedInstance.updatedAt)
    }
}
