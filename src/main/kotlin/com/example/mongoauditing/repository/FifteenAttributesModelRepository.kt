package com.example.mongoauditing.repository

import com.example.mongoauditing.model.FifteenAttributesModel
import org.springframework.data.repository.CrudRepository

interface FifteenAttributesModelRepository : CrudRepository<FifteenAttributesModel, String>
