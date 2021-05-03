package com.example.currency_app.entity

import androidx.lifecycle.LiveData
import androidx.room.*


@Dao
interface dao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend  fun insert(article:Rates):Long


    @Query("SELECT * FROM exchange")
    fun getall(): LiveData<List<Rates>>

    @Delete
    suspend fun deletearticel(article: Rates)

}