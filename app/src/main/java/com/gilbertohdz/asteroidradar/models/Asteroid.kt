package com.gilbertohdz.asteroidradar.models

import android.os.Parcelable
import com.gilbertohdz.asteroidradar.entities.AsteroidEntity
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Asteroid(
    val id: Long,
    val codename: String,
    val closeApproachDate: String,
    val absoluteMagnitude: Double,
    val estimatedDiameter: Double,
    val relativeVelocity: Double,
    val distanceFromEarth: Double,
    val isPotentiallyHazardous: Boolean
) : Parcelable

fun ArrayList<Asteroid>.asDatabaseEntity(): List<AsteroidEntity> {
    return map {
        AsteroidEntity(
                0,
                it.id,
                it.codename,
                it.closeApproachDate,
                it.absoluteMagnitude,
                it.estimatedDiameter,
                it.relativeVelocity,
                it.distanceFromEarth,
                it.isPotentiallyHazardous
        )
    }
}