package com.elyeproj.base

import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [BaseNetworkModule::class, BaseRepositoryModule::class])
interface BaseComponent {
    val baseSubcomponent: BaseSubcomponent
}
