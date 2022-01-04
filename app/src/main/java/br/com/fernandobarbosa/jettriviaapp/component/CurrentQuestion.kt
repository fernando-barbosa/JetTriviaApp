package br.com.fernandobarbosa.jettriviaapp.component

import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.fernandobarbosa.jettriviaapp.util.AppColors

@Composable
fun CurrentQuestion(question: String) {
    Text(
        text = question,
        modifier = Modifier
            .padding(6.dp)
            .fillMaxHeight(0.3f),
        fontSize = 16.sp,
        color = AppColors.mOffWhite,
        fontWeight = FontWeight.Bold,
        lineHeight = 22.sp
    )
}