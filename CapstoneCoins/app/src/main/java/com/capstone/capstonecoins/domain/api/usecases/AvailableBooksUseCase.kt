package com.capstone.capstonecoins.domain.api.usecases

import android.util.Log
import com.capstone.capstonecoins.data.repository.CoinsRepositoryImpl
import com.capstone.capstonecoins.data.repository.models.Book
import com.capstone.capstonecoins.data.utils.SUFFIX_MXN
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import javax.inject.Inject

class AvailableBooksUseCase
@Inject constructor(var repository: CoinsRepositoryImpl) {
    lateinit var response: List<Book>
    /*suspend fun book(): Flow<List<Book>> = flow {
        try {
            response = repository.getAvailableBooks().filter {
                it.id.endsWith(SUFFIX_MXN)
            }
            repository.insertLocalBooks(response)
            emit(response)
        } catch (e: HttpException) {
            Log.d("Mensaje", "Show Error: $e")
        }
    }*/

    suspend inline fun inlineBook(): Flow<List<Book>> = flow {
        try {
            response = repository.getAvailableBooks().filter {
                it.id.endsWith(SUFFIX_MXN)
            }
            repository.insertLocalBooks(response)
            emit(response)
        } catch (e: HttpException) {
            Log.d("Mensaje", "Show Error: $e")
        }
    }

}