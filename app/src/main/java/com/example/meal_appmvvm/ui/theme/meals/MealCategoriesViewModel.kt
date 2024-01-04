package com.example.meal_appmvvm.ui.theme.meals

import androidx.lifecycle.ViewModel
import com.example.meal_appmvvm.ui.theme.model.MealRepository
import com.example.meal_appmvvm.ui.theme.model.response.MealResponse
import com.example.meal_appmvvm.ui.theme.model.response.MealsCategoriesResponse

class MealCategoriesViewModel(private val repository: MealRepository= MealRepository()):ViewModel()
{fun getMeals(successCallback:(response:MealsCategoriesResponse?)->Unit){
    repository.getMeals{ response -> successCallback(response)  }
}
}