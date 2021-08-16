package com.example.currencyexchange.domain.di

import com.example.currencyexchange.domain.GetExchangeValueUseCase
import com.example.currencyexchange.domain.ListExchangeUseCase
import com.example.currencyexchange.domain.SaveExchangeUseCase
import org.koin.core.context.loadKoinModules
import org.koin.core.module.Module
import org.koin.dsl.module

object DomainModule {

    fun load() {
        loadKoinModules(useCaseModules())
    }

    private fun useCaseModules(): Module {
        return module {
            factory { ListExchangeUseCase(get()) }
            factory { SaveExchangeUseCase(get()) }
            factory { GetExchangeValueUseCase(get()) }
        }
    }
}