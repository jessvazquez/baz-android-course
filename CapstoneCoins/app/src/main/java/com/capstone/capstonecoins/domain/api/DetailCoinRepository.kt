package com.capstone.capstonecoins.domain.api

import com.capstone.capstonecoins.data.models.orderbook.OrderBooks
import com.capstone.capstonecoins.data.models.ticker.tickerquery.TickerWithQuery
import com.capstone.capstonecoins.data.repository.models.BookDetail
import io.reactivex.rxjava3.core.Single

interface DetailCoinRepository {
    suspend fun getDetailCoin(typeCoin: String): Single<TickerWithQuery>
    suspend fun getLocalDetailCoin(typeCoin: String): BookDetail
    suspend fun getBidsAsksCoin(typeCoin: String): OrderBooks
    suspend fun getLocalBidsAsksCoin(): List<OrderBooks>
    suspend fun insertLocalDetailBook(bookDetail: BookDetail)
}