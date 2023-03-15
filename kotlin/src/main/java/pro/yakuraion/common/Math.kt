package pro.yakuraion.common

infix fun Int.pow(x: Int): Int = this.toBigInteger().pow(x).toInt()
