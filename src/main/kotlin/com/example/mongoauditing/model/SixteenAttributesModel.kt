package com.example.mongoauditing.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document(collection = "sixteen_attributes_model")
data class SixteenAttributesModel(

    val attribute0: String = "attribute0",

    val attribute1: String = "attribute1",

    val attribute2: String = "attribute2",

    val attribute3: String = "attribute3",

    val attribute4: String = "attribute4",

    val attribute5: String = "attribute5",

    val attribute6: String = "attribute6",

    val attribute7: String = "attribute7",

    val attribute8: String = "attribute8",

    val attribute9: String = "attribute9",

    val attribute10: String = "attribute10",

    val attribute11: String = "attribute11",

    val attribute12: String = "attribute12",

    val attribute13: String = "attribute13",

    val attribute14: String = "attribute14",

    val attribute15: String = "attribute15",

    @Id val id: String? = null
)
