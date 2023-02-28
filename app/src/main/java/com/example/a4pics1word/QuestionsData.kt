package com.example.a4pics1word

import androidx.annotation.DrawableRes

data class QuestionsData(
    val id:Int,
    @DrawableRes val images:List<Int>,
    val correctAnswers:String

)