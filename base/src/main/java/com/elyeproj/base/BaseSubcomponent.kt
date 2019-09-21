package com.elyeproj.base

import dagger.Subcomponent

@Subcomponent
interface BaseSubcomponent {
    val baseNetwork: BaseNetwork
    val baseRepository: BaseRepository
}
