package com.jorge.apoorinstabram.session

class SessionRepositoryImpl(
    val memoryDataSource: SessionMemoryDataSource,
    val localDataSource: SessionLocalDataSource,
) : SessionRepository {
    override fun getSession(): Session? {
        val session = memoryDataSource.session
        return if (session == null) {
            var session = localDataSource.retrieveSession()
            memoryDataSource.session = session
            session
        } else {
            session
        }
    }

    override fun saveSession(session: Session) {
        memoryDataSource.session = session
        localDataSource.saveSession(session)
    }


}