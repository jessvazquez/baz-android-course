package com.capstone.capstonecoins.data.repository

import com.capstone.capstonecoins.data.models.availablebooks.BooksDto
import com.capstone.capstonecoins.data.models.availablebooks.Payload
import com.capstone.capstonecoins.domain.api.ApiService
import com.capstone.capstonecoins.domain.api.BooksDao
import com.capstone.capstonecoins.domain.api.CoinsRepository
import io.mockk.coEvery
import kotlinx.coroutines.runBlocking
import org.junit.Before

class CoinsRepositoryImplTest {
    lateinit var api: ApiService
    lateinit var dao: BooksDao
    lateinit var systemUnderTest: CoinsRepository


    @Before
    fun getAvailableBooksTest() = runBlocking {
        //Given
      /*  coEvery {
            api.getAvailableBooks()
        } returns BooksDtoResult*/
        //When

        //then


    }

    var listPayload = ArrayList<Payload>()
    //val BooksDtoResult = BooksDto(payload = listPayload.add(Payload(), true), success = true)

}