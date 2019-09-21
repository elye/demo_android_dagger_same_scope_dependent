package com.elyeproj.modular1bottombase

import com.elyeproj.base.BaseSubcomponent
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(dependencies = [BaseSubcomponent::class], modules = [AppDependentModule::class])
interface MainComponent {
    fun inject(mainActivity: MainActivity)
}
