package com.jorge.apoorinstabram.session

import android.content.SharedPreferences

class SessionLocalDataSource(private val sharedPreferences: SharedPreferences) {

    fun saveSession(session: Session) {
        var editor = sharedPreferences.edit()
        editor.putString("ACCES_TOKEN", session.accesToken).apply()
        editor.putString("ACCOUNT_NAME", session.accountName).apply()
    }

    fun retrieveSession(): Session? {
        val accesToken = sharedPreferences.getString("ACCES_TOKEN", null) ?: return null
        val accountName = sharedPreferences.getString("ACCOUNT_NAME", null) ?: return null
        return Session(accesToken, accountName)
    }
}