package br.com.fernandobarbosa.jettriviaapp.screens

import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import br.com.fernandobarbosa.jettriviaapp.component.Questions
import br.com.fernandobarbosa.jettriviaapp.viewmodel.QuestionsViewModel

@Composable
fun TriviaHome(viewModel: QuestionsViewModel = hiltViewModel()) {
    Questions(viewModel)
}