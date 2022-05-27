package com.diaz.jonathan.dogslist_completo

import okhttp3.MultipartBody
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Url



interface APIService {
    @Headers("Accept: application/json")
    @GET
    suspend fun getDogsByBreeds(@Url ulr:String):Response<DogsResponse>

//ejemplos
   /* @GET("/example/example2/{id}/loquesea")
    fun getExample(@Path("id") id: String): Call<DogsResponse>

    @GET("/example/example2/v2/loquesea")
    fun getExampleDiaz(@Query("pet") pet: String, @Query("name") name: String): Call<DogsResponse>

    @POST
    fun ExampleDiaz(@Body exampleDiazDto: ExampleDiazDto): Call<*>

    @Multipart
    @POST
    fun getEVERYTHING2(
        @Part image: MultipartBody.Part,
        @Part("example") ExampleD: String
    ): Call<*>*/


}

//data class ExampleDiazDto(val name:String, val edad:Int)