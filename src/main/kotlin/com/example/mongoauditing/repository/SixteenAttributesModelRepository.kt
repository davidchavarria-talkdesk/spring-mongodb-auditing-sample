package com.example.mongoauditing.repository

import com.example.mongoauditing.model.SixteenAttributesModel
import org.springframework.data.repository.CrudRepository

interface SixteenAttributesModelRepository : CrudRepository<SixteenAttributesModel, String>
