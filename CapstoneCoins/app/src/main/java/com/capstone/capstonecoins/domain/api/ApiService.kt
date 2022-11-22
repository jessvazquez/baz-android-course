package com.capstone.capstonecoins.domain.api

import com.capstone.capstonecoins.data.models.availablebooks.BooksDto
import com.capstone.capstonecoins.data.models.orderbook.OrderBooks
import com.capstone.capstonecoins.data.models.ticker.tickerquery.TickerWithQuery
import io.reactivex.rxjava3.core.Single
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    @GET("available_books/")
    suspend fun getAvailableBooks(): BooksDto

    @GET("order_book/")
    suspend fun getOrderBooks(
        @Query("book")
        book: String
    ): OrderBooks

    @GET("ticker/")
    fun getTicker(
        @Query("book")
        book: String
    ): Single<TickerWithQuery>

}