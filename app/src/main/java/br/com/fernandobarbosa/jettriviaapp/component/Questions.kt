package br.com.fernandobarbosa.jettriviaapp.component

import android.util.Log
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.runtime.Composable
import br.com.fernandobarbosa.jettriviaapp.viewmodel.QuestionsViewModel

@Composable
fun Questions(viewModel: QuestionsViewModel) {
    val questions = viewModel.data.value.data?.toMutableList()
    if(viewModel.data.value.loading == true) {
        CircularProgressIndicator()
    } else {
        questions?.forEach { question ->
            Log.d("[Questions]", "Result: ${question.question}")
        }
    }
}