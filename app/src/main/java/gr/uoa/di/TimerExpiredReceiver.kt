package gr.uoa.di

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import gr.uoa.di.util.NotificationUtil
import gr.uoa.di.util.PrefUtil

class TimerExpiredReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {
        NotificationUtil.showTimerExpired(context)
        PrefUtil.setTimerState(MainActivity.TimerState.Stopped,context)
        PrefUtil.setAlarmSetTime(0,context)
    }
}
