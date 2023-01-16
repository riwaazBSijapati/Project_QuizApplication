package com.quiz.quizappassignment7.util

import com.quiz.quizappassignment7.data.Quiz

interface RadioClickInterface {
    fun onRadioButtonClicked(optionPosition: Int, userAnswerDesc: String)
}