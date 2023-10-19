package com.danilkharytonov.architecturepatterns.decorator

import android.graphics.Bitmap

class TelegramNotifier {
    fun notifyMessage(message: String) {}
    fun notifyPost(image: Bitmap, message: String) {}
}

class WhatsAppNotifier {
    fun notifyMessage(message: String) {}
}

class MessengerNotifier {
    fun notifyMessage(message: String) {}
}

class NotifierBase(
    private val telegramNotifier: TelegramNotifier,
    private val whatsAppNotifier: WhatsAppNotifier,
    private val messengerNotifier: MessengerNotifier
) : Notifier {
    override fun notifyMessage(message: String) {
        telegramNotifier.notifyMessage(message)
        whatsAppNotifier.notifyMessage(message)
        messengerNotifier.notifyMessage(message)
    }

    override fun notifyPost(image: Bitmap, message: String) {
        telegramNotifier.notifyPost(image, message)
    }
}

interface Notifier {
    fun notifyMessage(message: String)
    fun notifyPost(image: Bitmap, message: String)
}
