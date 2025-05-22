package com.example.bosquedexcolomos.ui

import com.example.bosquedexcolomos.data.AuthService
import com.example.bosquedexcolomos.ui.log.LogViewModel
import com.example.bosquedexcolomos.ui.splash.SplashViewModel
import org.koin.core.module.dsl.factoryOf
import org.koin.core.module.dsl.viewModelOf
import org.koin.dsl.module

val viewModelModule = module {
    factoryOf(::AuthService)
    viewModelOf(::SplashViewModel)
    viewModelOf(::LogViewModel)

}
