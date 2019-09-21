package com.elyeproj.featureone

import com.elyeproj.base.BaseSubcomponent
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(dependencies = [BaseSubcomponent::class], modules = [FeatureOneDependentModule::class])
interface FeatureOneComponent {
    fun inject(featureOneActivity: FeatureOneActivity)
}
