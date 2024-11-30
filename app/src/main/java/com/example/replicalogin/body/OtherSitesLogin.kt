package com.example.replicalogin.body

import androidx.compose.foundation.layout.Row
import androidx.compose.runtime.Composable

@Composable
fun OtherLogins(){
    Row {
        GitHubLogin()
        GoogleLogin()
    }
}