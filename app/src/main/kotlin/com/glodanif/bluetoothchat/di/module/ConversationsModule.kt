package com.glodanif.bluetoothchat.di.module

import com.glodanif.bluetoothchat.data.model.BluetoothConnector
import com.glodanif.bluetoothchat.data.model.BluetoothConnectorImpl
import com.glodanif.bluetoothchat.data.model.ConversationsStorage
import com.glodanif.bluetoothchat.data.model.SettingsManager
import com.glodanif.bluetoothchat.di.PerActivity
import com.glodanif.bluetoothchat.ui.activity.ConversationsActivity
import com.glodanif.bluetoothchat.ui.presenter.ConversationsPresenter
import com.glodanif.bluetoothchat.ui.viewmodel.converter.ConversationConverter
import dagger.Module
import dagger.Provides

@Module
class ConversationsModule(private val activity: ConversationsActivity) {

    @Provides
    @PerActivity
    internal fun providePresenter(connector: BluetoothConnector, storage: ConversationsStorage,
                                  settings: SettingsManager, converter: ConversationConverter): ConversationsPresenter =
            ConversationsPresenter(activity, connector, storage, settings, converter)

    @Provides
    @PerActivity
    internal fun provideConnector(): BluetoothConnector = BluetoothConnectorImpl(activity)
}
