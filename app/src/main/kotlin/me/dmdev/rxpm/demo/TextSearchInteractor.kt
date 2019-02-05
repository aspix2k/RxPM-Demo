package me.dmdev.rxpm.demo

import io.reactivex.Single

/**
 * @author aspix
 * 05/02/2019 21:50
 */
interface TextSearchInteractor {

    fun findWords(params: SearchParams): Single<List<String>>
}