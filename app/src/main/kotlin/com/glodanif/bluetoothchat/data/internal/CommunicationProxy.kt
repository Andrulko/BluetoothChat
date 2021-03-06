package com.glodanif.bluetoothchat.data.internal

import android.bluetooth.BluetoothDevice
import com.glodanif.bluetoothchat.data.entity.ChatMessage
import com.glodanif.bluetoothchat.data.entity.Conversation
import com.glodanif.bluetoothchat.data.service.BluetoothConnectionService

interface CommunicationProxy {

    fun onConnecting()
    fun onConnected(device: BluetoothDevice)
    fun onConnectedIn(conversation: Conversation)
    fun onConnectedOut(conversation: Conversation)
    fun onConnectionLost()
    fun onConnectionFailed()
    fun onConnectionDestroyed()
    fun onDisconnected()
    fun onConnectionAccepted()
    fun onConnectionRejected()
    fun onConnectionWithdrawn()

    fun onMessageReceived(message: ChatMessage)
    fun onMessageSent(message: ChatMessage)
    fun onMessageDelivered(id: String)
    fun onMessageNotDelivered(id: String)
    fun onMessageSeen(id: String)

    fun onFileSendingStarted(fileAddress: String?, fileSize: Long)
    fun onFileSendingProgress(sentBytes: Long, totalBytes: Long)
    fun onFileSendingFinished()
    fun onFileSendingFailed()
    fun onFileReceivingStarted(fileSize: Long)
    fun onFileReceivingProgress(sentBytes: Long, totalBytes: Long)
    fun onFileReceivingFinished()
    fun onFileReceivingFailed()
    fun onFileTransferCanceled(byPartner: Boolean)
}
