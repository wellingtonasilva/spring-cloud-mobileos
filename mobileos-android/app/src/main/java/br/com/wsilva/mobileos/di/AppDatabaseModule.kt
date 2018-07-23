package br.com.wsilva.mobileos.di

import android.app.Application
import android.arch.persistence.room.Room
import br.com.wsilva.mobileos.constants.AppConstants
import br.com.wsilva.mobileos.model.dao.VeiculoTipoDAO
import br.com.wsilva.mobileos.model.db.AppDatabase
import br.com.wsilva.mobileos.model.repository.VeiculoTipoRepository
import br.com.wsilva.mobileos.service.AppApiService
import dagger.Module
import dagger.Provides
import javax.inject.Inject

@Module
class AppDatabaseModule {
    companion object {
        @JvmStatic
        lateinit var appDatabase: AppDatabase
    }

    var application: Application
    var apiService: AppApiService

    @Inject
    constructor(application: Application) {
        this.application = application
        appDatabase = Room.databaseBuilder(application, AppDatabase::class.java, "mobileos.db").build()
        apiService = AppApiService(AppConstants.BASE_URL_APP_CLOUD)
    }

    @Provides
    fun application(): Application {
        return application
    }

    @Provides
    fun providesAppDatabase(application: Application): AppDatabase {
        return appDatabase
    }

    @Provides
    fun providesAppApiService(): AppApiService {
        return AppApiService(AppConstants.BASE_URL_APP_CLOUD)
    }

    @Provides
    fun providesVeiculoTipoDAO(): VeiculoTipoDAO {
        return appDatabase.getVeiculoTipoDAO()
    }

    @Provides
    fun providesVeiculoTipoRepository(dao: VeiculoTipoDAO): VeiculoTipoRepository {
        return VeiculoTipoRepository(dao)
    }
}