package br.com.fernandobarbosa.jettriviaapp

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.ViewModel
import br.com.fernandobarbosa.jettriviaapp.screens.TriviaHome
import br.com.fernandobarbosa.jettriviaapp.ui.theme.JetTriviaAppTheme
import br.com.fernandobarbosa.jettriviaapp.viewmodel.QuestionsViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetTriviaAppTheme {
                TriviaHome()
            }
        }
    }
}