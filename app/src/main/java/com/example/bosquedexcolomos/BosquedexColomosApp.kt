package com.example.bosquedexcolomos

import android.app.Application
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.bosquedexcolomos.data.dataModule
import com.example.bosquedexcolomos.data.networkModule
import com.example.bosquedexcolomos.domain.domainModule
import com.example.bosquedexcolomos.ui.splash.SplashScreen
import com.example.bosquedexcolomos.ui.splash.SplashViewModel
import com.example.bosquedexcolomos.ui.viewModelModule
import org.koin.core.context.GlobalContext.startKoin
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.module.dsl.viewModelOf


class BosquedexColomosApp : Application(){

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidLogger()
            androidContext(this@BosquedexColomosApp)
            modules(
                appModule,
                //viewModelOf(::SplashViewModel),
                dataModule,
                viewModelModule,
                domainModule,
                networkModule,
            )
        }


    }
}