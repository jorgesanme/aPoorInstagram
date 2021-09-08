package com.jorge.apoorinstagram.session;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0003H&\u00a8\u0006\u0007"}, d2 = {"Lcom/jorge/apoorinstagram/session/SessionRepository;", "", "getSession", "Lcom/jorge/apoorinstagram/session/Session;", "saveSession", "", "session", "app_debug"})
public abstract interface SessionRepository {
    
    @org.jetbrains.annotations.Nullable()
    public abstract com.jorge.apoorinstagram.session.Session getSession();
    
    public abstract void saveSession(@org.jetbrains.annotations.NotNull()
    com.jorge.apoorinstagram.session.Session session);
}