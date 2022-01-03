package br.com.fernandobarbosa.jettriviaapp.repository

import android.util.Log
import br.com.fernandobarbosa.jettriviaapp.data.DataOrException
import br.com.fernandobarbosa.jettriviaapp.model.QuestionItem
import br.com.fernandobarbosa.jettriviaapp.network.QuestionApi
import javax.inject.Inject

class QuestionRepository @Inject constructor(private val api: QuestionApi) {
    private val dataOrException =
        DataOrException<
                ArrayList<QuestionItem>,
                Boolean,
                Exception
        >()

    suspend fun getAllQuestions(): DataOrException<ArrayList<QuestionItem>, Boolean, java.lang.Exception> {
        try {
            dataOrException.loading = true
            dataOrException.data = api.getAllQuestions()
            if (dataOrException.data.toString().isNotEmpty()) dataOrException.loading = false
        } catch (exception: Exception) {
            dataOrException.e = exception
            Log.d("[Exception]", "getAllQuestions: ${dataOrException.e!!.localizedMessage}")
        }

        return dataOrException
    }
}