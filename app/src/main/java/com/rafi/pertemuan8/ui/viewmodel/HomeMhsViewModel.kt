package com.rafi.pertemuan8.ui.viewmodel

import com.rafi.pertemuan8.data.entity.Mahasiswa


data class HomeUiState(
    val listMhs: List<Mahasiswa> = listOf(),
    val isLoading: Boolean = false,
    val isError: Boolean = false,
    val errorMessage: String = ""
)