package com.example.pullrequest.apihelper

import com.example.pullrequest.model.PullRequestService
import com.example.pullrequest.viewmodel.PullRequestViewModel
import dagger.Component

@Component(modules = [ApiModule::class])
interface ApiComponent {

    fun inject(service: PullRequestService)

    fun inject(viewModel: PullRequestViewModel)
}