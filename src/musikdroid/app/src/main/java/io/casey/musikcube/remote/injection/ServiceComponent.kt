package io.casey.musikcube.remote.injection

import dagger.Component
import io.casey.musikcube.remote.service.playback.impl.remote.RemotePlaybackService
import io.casey.musikcube.remote.service.playback.impl.streaming.StreamingPlaybackService

@ServiceScope
@Component(
    dependencies = arrayOf(AppComponent::class),
    modules = arrayOf(DataModule::class))
interface ServiceComponent {
    fun inject(service: StreamingPlaybackService)
    fun inject(service: RemotePlaybackService)
}