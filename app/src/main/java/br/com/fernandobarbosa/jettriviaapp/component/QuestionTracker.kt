package br.com.fernandobarbosa.jettriviaapp.component

import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.ParagraphStyle
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextIndent
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.fernandobarbosa.jettriviaapp.util.AppColors
import br.com.fernandobarbosa.jettriviaapp.util.FontSizes

@Composable
fun QuestionTracker(counter: Int = 10, outOf: Int = 1000) {
    Text(text = buildAnnotatedString {
        withStyle(
            style = ParagraphStyle(
                textIndent = TextIndent.None
            )
        ) {
            withStyle(
                style = SpanStyle(
                    color = AppColors.mLightGray,
                    fontWeight = FontWeight.Bold,
                    fontSize = FontSizes.large
                )
            ) {
                append("Question $counter/")
                withStyle(
                    style = SpanStyle(
                        color = AppColors.mLightGray,
                        fontWeight = FontWeight.Light,
                        fontSize = FontSizes.medium
                    )
                ) {
                    append("$outOf")
                }
            }
        }
    },
        modifier = Modifier.padding(20.dp)
    )
}
