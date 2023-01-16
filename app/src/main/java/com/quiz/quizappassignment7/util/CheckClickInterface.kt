package com.quiz.quizappassignment7.util

import com.quiz.quizappassignment7.data.AnswerModel

interface CheckClickInterface {
    fun onCheckBoxChecked(answerModel: AnswerModel)
    fun onCheckBoxUnChecked(answerModel: AnswerModel)
}