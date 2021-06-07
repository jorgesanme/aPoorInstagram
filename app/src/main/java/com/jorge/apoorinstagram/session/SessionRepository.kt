package com.jorge.apoorinstagram.session

interface SessionRepository {
    fun getSession(): Session?
    fun saveSession(session: Session)
}