package pro.yakuraion.androidcommon.coroutines

import kotlinx.coroutines.CoroutineDispatcher

class Dispatchers(
    val ioDispatcher: CoroutineDispatcher,
    val computeDispatcher: CoroutineDispatcher,
    val mainDispatcher: CoroutineDispatcher
)
