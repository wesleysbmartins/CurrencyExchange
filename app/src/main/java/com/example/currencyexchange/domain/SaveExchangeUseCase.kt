package com.example.currencyexchange.domain

import com.example.currencyexchange.core.UseCase
import com.example.currencyexchange.data.model.ExchangeResponseValue
import com.example.currencyexchange.data.repository.CoinRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class SaveExchangeUseCase(
    private val repository: CoinRepository
) : UseCase.NoSource<ExchangeResponseValue>() {

    override suspend fun execute(param: ExchangeResponseValue): Flow<Unit> {
        return flow {
            repository.save(param)
            emit(Unit)
        }
    }
}