package com.example.currencyexchange.domain

import com.example.currencyexchange.core.UseCase
import com.example.currencyexchange.data.model.ExchangeResponseValue
import com.example.currencyexchange.data.repository.CoinRepository
import kotlinx.coroutines.flow.Flow

class ListExchangeUseCase(
    private val repository: CoinRepository
) : UseCase.NoParam<List<ExchangeResponseValue>>() {

    override suspend fun execute(): Flow<List<ExchangeResponseValue>> {
        return repository.list()
    }
}