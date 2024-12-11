package com.rafi.pertemuan8.data.dao

import androidx.room.Dao
import androidx.room.Insert
import com.rafi.pertemuan8.data.entity.Mahasiswa

@Dao
interface MahasiswaDao {
    @Insert
    suspend fun insertMahasiswa(mahasiswa: Mahasiswa)
}