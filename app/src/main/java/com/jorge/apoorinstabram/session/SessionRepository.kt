package com.jorge.apoorinstabram.session

interface SessionRepository {
    fun getSession(): Session?
    fun saveSession(session: Session)
}