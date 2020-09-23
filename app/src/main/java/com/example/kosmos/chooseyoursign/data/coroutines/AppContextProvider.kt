package com.example.kosmos.chooseyoursign.data.coroutines

import kotlinx.coroutines.Dispatchers
import kotlin.coroutines.CoroutineContext

object AppContextProvider : CoroutinesContextProvider {

    var coroutinesContextProviderDelegate: CoroutinesContextProvider? = null

    override val main: CoroutineContext by lazy {
        coroutinesContextProviderDelegate?.main ?: Dispatchers.Main
    }

    override val io: CoroutineContext by lazy {
        coroutinesContextProviderDelegate?.io ?: Dispatchers.IO
    }
}