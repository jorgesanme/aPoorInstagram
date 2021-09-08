package com.jorge.apoorinstagram.session;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\n\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\fH\u0016R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0010"}, d2 = {"Lcom/jorge/apoorinstagram/session/SessionRepositoryImpl;", "Lcom/jorge/apoorinstagram/session/SessionRepository;", "memoryDataSource", "Lcom/jorge/apoorinstagram/session/SessionMemoryDataSource;", "localDataSource", "Lcom/jorge/apoorinstagram/session/SessionLocalDataSource;", "(Lcom/jorge/apoorinstagram/session/SessionMemoryDataSource;Lcom/jorge/apoorinstagram/session/SessionLocalDataSource;)V", "getLocalDataSource", "()Lcom/jorge/apoorinstagram/session/SessionLocalDataSource;", "getMemoryDataSource", "()Lcom/jorge/apoorinstagram/session/SessionMemoryDataSource;", "getSession", "Lcom/jorge/apoorinstagram/session/Session;", "saveSession", "", "session", "app_debug"})
public final class SessionRepositoryImpl implements com.jorge.apoorinstagram.session.SessionRepository {
    @org.jetbrains.annotations.NotNull()
    private final com.jorge.apoorinstagram.session.SessionMemoryDataSource memoryDataSource = null;
    @org.jetbrains.annotations.NotNull()
    private final com.jorge.apoorinstagram.session.SessionLocalDataSource localDataSource = null;
    
    public SessionRepositoryImpl(@org.jetbrains.annotations.NotNull()
    com.jorge.apoorinstagram.session.SessionMemoryDataSource memoryDataSource, @org.jetbrains.annotations.NotNull()
    com.jorge.apoorinstagram.session.SessionLocalDataSource localDataSource) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.jorge.apoorinstagram.session.SessionMemoryDataSource getMemoryDataSource() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.jorge.apoorinstagram.session.SessionLocalDataSource getLocalDataSource() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public com.jorge.apoorinstagram.session.Session getSession() {
        return null;
    }
    
    @java.lang.Override()
    public void saveSession(@org.jetbrains.annotations.NotNull()
    com.jorge.apoorinstagram.session.Session session) {
    }
}