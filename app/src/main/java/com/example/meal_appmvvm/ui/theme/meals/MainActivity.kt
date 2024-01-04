package com.example.meal_appmvvm.ui.theme.meals

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.meal_appmvvm.ui.theme.Meal_appMVVMTheme
import com.example.meal_appmvvm.ui.theme.model.response.MealResponse

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            Meal_appMVVMTheme {
                // A surface container using the 'background' color from the theme

                    MealCategoriesScreen()

            }
        }
    }
}

@Composable
fun MealCategoriesScreen() {
    val viewModel:MealCategoriesViewModel= viewModel()
    val rememberMeals:MutableState<List<MealResponse>> = remember { mutableStateOf(emptyList<MealResponse>()) }
    viewModel.getMeals { response ->
        val mealsFromTheApi = response?.categories
        rememberedMeals.value=mealsFromTheApi
    }

    Text(
        text = rememberMeals.value.toString()
    )
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Meal_appMVVMTheme {
        MealCategoriesScreen()
    }
}