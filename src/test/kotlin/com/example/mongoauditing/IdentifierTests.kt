package com.example.mongoauditing

import com.example.mongoauditing.model.FifteenAttributesModel
import com.example.mongoauditing.model.SixteenAttributesModel
import com.example.mongoauditing.repository.FifteenAttributesModelRepository
import com.example.mongoauditing.repository.SixteenAttributesModelRepository
import org.junit.Assert.assertNotNull
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner

@RunWith(SpringRunner::class)
@SpringBootTest
class IdentifierTests {

    @Autowired private lateinit var fifteenAttributesModelRepository: FifteenAttributesModelRepository
    @Autowired private lateinit var sixteenAttributesModelRepository: SixteenAttributesModelRepository

    @Test fun `when the @Id field is a val and the model has fifteen attributes should populate the @Id field`() {
        val returnedModel = fifteenAttributesModelRepository.save(FifteenAttributesModel())

        assertNotNull(returnedModel.id)
    }

    @Test fun `when the @Id field is a val and the model has sixteen attributes should populate the @Id field`() {
        val returnedModel = sixteenAttributesModelRepository.save(SixteenAttributesModel())

        assertNotNull(returnedModel.id)
    }
}
