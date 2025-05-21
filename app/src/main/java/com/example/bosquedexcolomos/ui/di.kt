package com.example.bosquedexcolomos.ui

import com.example.bosquedexcolomos.ui.log.LogViewModel
import com.example.bosquedexcolomos.ui.splash.SplashViewModel
import org.koin.core.module.dsl.viewModelOf
import org.koin.dsl.module

val viewModelModule = module {
    viewModelOf(::SplashViewModel)
    viewModelOf(::LogViewModel)

}
