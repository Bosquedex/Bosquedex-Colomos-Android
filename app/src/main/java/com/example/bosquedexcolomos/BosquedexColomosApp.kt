package com.example.bosquedexcolomos

import android.app.Application
import com.example.bosquedexcolomos.data.dataModule
import com.example.bosquedexcolomos.ui.viewModelModule
import org.koin.core.context.GlobalContext.startKoin
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger

class BosquedexColomosApp : Application(){

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidLogger()
            androidContext(this@BosquedexColomosApp)
            modules(
                appModule,
                dataModule,
                viewModelModule
            )
        }


    }
}