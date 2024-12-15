package com.rafi.pertemuan8.ui.viewmodel

import com.rafi.pertemuan8.data.entity.Mahasiswa

fun Mahasiswa.toUIStateMhs(): MhsUIState = MhsUIState(
    mahasiswaEvent = this.toDetailUiEvent()
)