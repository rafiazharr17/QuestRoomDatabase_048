package com.rafi.pertemuan8.repository

import com.rafi.pertemuan8.data.entity.Mahasiswa

interface RepositoryMhs {
    suspend fun insertMhs(mahasiswa: Mahasiswa)
}