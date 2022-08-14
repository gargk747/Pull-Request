package com.example.pullrequest.model

import io.reactivex.Single
import javax.inject.Inject
import com.example.pullrequest.apihelper.DaggerApiComponent

class PullRequestService {

    @Inject
    lateinit var api:PullRequestApi

    init {
        DaggerApiComponent.create().inject(this)
    }

    fun getPullRequest(): Single<List<PullRequest>> {
        return api.getPullRequest()
    }
}