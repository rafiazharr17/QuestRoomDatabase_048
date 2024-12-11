package com.rafi.pertemuan8.dependeciesinjection

import android.content.Context
import com.rafi.pertemuan8.data.database.KrsDatabase
import com.rafi.pertemuan8.repository.LocalRepositoryMhs
import com.rafi.pertemuan8.repository.RepositoryMhs

interface InterfaceContainerApp {
    val repositoryMhs: RepositoryMhs
}

class ContainerApp (private val context: Context) : InterfaceContainerApp {
    override val repositoryMhs: RepositoryMhs by lazy {
        LocalRepositoryMhs(KrsDatabase.getDatabase(context).mahasiswaDao())
    }
}