package com.example.bosquedexcolomos.data

import com.google.firebase.auth.FirebaseAuth
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module

val dataModule = module {
      //single { FirebaseAuth.getInstance() }

}

val networkModule = module{
    single { FirebaseAuth.getInstance() }
    //singleOf(::FirebaseAuth)
}
