package com.elyeproj.featuretwo

import com.elyeproj.base.BaseSubcomponent
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(dependencies = [BaseSubcomponent::class], modules = [FeatureTwoDependentModule::class])
interface FeatureTwoComponent {
    fun inject(featureOneActivity: FeatureTwoActivity)
}
