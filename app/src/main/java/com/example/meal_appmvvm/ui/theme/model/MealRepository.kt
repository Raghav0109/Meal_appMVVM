package com.example.meal_appmvvm.ui.theme.model

import com.example.meal_appmvvm.ui.theme.model.api.MealsWebServices
import com.example.meal_appmvvm.ui.theme.model.response.MealsCategoriesResponse
import retrofit2.Call
import retrofit2.Response
import javax.security.auth.callback.Callback

class MealRepository(private val webServices: MealsWebServices=MealsWebServices()) {
    fun getMeals(successCallback: (response:MealsCategoriesResponse?)->Unit) {
        return webServices.getMeals().enqueue(object :Callback<MealsCategoriesResponse>{
            fun onResponse(
                call:Call<MealsCategoriesResponse>
                response: Response<MealsCategoriesResponse>
            ){
                successCallback( response.body())
            }
            fun onFailure(call: Call<MealsCategoriesResponse>, t: Throwable){

            }
        })
        return
    }
}