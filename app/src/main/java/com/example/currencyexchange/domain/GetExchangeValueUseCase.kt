package com.example.currencyexchange.domain

import com.example.currencyexchange.core.UseCase
import com.example.currencyexchange.data.model.ExchangeResponseValue
import com.example.currencyexchange.data.repository.CoinRepository
import kotlinx.coroutines.flow.Flow

class GetExchangeValueUseCase(
    private val repository: CoinRepository
) : UseCase<String, ExchangeResponseValue>() {

    override suspend fun execute(param: String): Flow<ExchangeResponseValue> {
        return repository.getExchangeValue(param)
    }

}