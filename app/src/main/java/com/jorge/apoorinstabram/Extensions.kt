package com.jorge.apoorinstabram

fun Boolean.alsoIfTrue(cb: () -> Unit){
    if(this) cb()

}