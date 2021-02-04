package com.akimenkodenis.omdbtestapplication.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.akimenkodenis.omdbtestapplication.BuildConfig

@Database(
    entities = [OmdbMovieEntity::class],
    version = BuildConfig.DB_VERSION
)
abstract class OmdbDatabase : RoomDatabase() {

    abstract fun getOmdbDao(): OmdbDao
}