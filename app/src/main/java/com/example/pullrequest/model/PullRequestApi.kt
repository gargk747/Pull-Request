package com.example.pullrequest.model

import io.reactivex.Single
import retrofit2.http.GET

interface PullRequestApi {
      @GET("repos/gargk747/Invisible-Cloak/pulls?state=closed")
    fun getPullRequest(): Single<List<PullRequest>>
}
