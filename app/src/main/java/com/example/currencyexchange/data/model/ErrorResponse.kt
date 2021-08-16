package com.example.currencyexchange.data.model

data class ErrorResponse (
    val status: Long,
    val code: String,
    val message: String
)