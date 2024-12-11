package com.rafi.pertemuan8.repository

import com.rafi.pertemuan8.data.dao.MahasiswaDao
import com.rafi.pertemuan8.data.entity.Mahasiswa

class LocalRepositoryMhs(
    private val mahasiswaDao: MahasiswaDao
) : RepositoryMhs {
    override suspend fun insertMhs(mahasiswa: Mahasiswa) {
        mahasiswaDao.insertMahasiswa(mahasiswa)
    }
}