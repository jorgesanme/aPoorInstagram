package com.jorge.apoorinstagram

fun Boolean.alsoIfTrue(cb: () -> Unit){
    if(this) cb()

}