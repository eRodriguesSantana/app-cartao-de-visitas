package br.com.eduardorodrigues.businesscard

import android.app.Application
import br.com.eduardorodrigues.businesscard.data.AppDatabase
import br.com.eduardorodrigues.businesscard.data.BusinessCardRepository

class App: Application() {
    val database by lazy{ AppDatabase.getDatabase(this) }
    val repository by lazy { BusinessCardRepository(database.businessDao()) }
}