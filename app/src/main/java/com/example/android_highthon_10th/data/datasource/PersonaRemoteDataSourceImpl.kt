package com.example.android_highthon_10th.data.datasource

import android.util.Log
import com.example.android_highthon_10th.data.api.PersonaApi
import com.example.android_highthon_10th.data.datasource.source.PersonaRemoteDataSource
import com.example.android_highthon_10th.data.model.response.PersonasDetailResponse
import com.example.android_highthon_10th.data.model.response.PersonasResponse
import okhttp3.MultipartBody
import javax.inject.Inject

class PersonaRemoteDataSourceImpl @Inject constructor(
    private val api: PersonaApi
): PersonaRemoteDataSource {
    override suspend fun getPersonas(): List<PersonasResponse> {
        Log.d("확인1", "!!!@#2131243143123123123132123123 = ${api.getPersonas()}")
        return api.getPersonas()
    }

    override suspend fun postPersona(
        name: String,
        description: String,
        profileImage: MultipartBody.Part
    ): PersonasDetailResponse {
        return api.postPersona(name, description, profileImage)
    }

    override suspend fun getPersonaDetail(uuid: Int): PersonasDetailResponse {
        return api.getPersonaDetail(uuid)
    }

}