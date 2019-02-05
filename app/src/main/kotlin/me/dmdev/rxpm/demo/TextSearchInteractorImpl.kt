package me.dmdev.rxpm.demo

import io.reactivex.Single
import io.reactivex.schedulers.Schedulers

/**
 * @author Dmitriy Gorbunov
 */

class TextSearchInteractorImpl : TextSearchInteractor {
    override fun findWords(params: SearchParams): Single<List<String>> {
        return Single
                .just(params)
                .map { (text, query) ->
                    text.split(" ", ",", ".", "?", "!", ignoreCase = true)
                            .filter { it.contains(query, ignoreCase = true) }
                }
                .subscribeOn(Schedulers.computation())
    }
}