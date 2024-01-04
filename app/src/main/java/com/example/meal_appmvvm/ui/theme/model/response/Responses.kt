package com.example.meal_appmvvm.ui.theme.model.response

import com.google.gson.annotations.SerializedName

data class MealsCategoriesResponse( val categories:List<MealResponse>)


//Gson deserialization
//JSON -> data classes


data class MealResponse(
    @SerializedName("idCategory") private val  id: String,
    @SerializedName("strCategory") private val  name: String,
    @SerializedName("strCategoryDescription") private val  description: String,
    @SerializedName("strCategoryThumb") private val  imageUrl: String
)