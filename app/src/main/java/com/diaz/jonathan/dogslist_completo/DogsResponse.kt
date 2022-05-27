package com.diaz.jonathan.dogslist_completo

import com.google.gson.annotations.SerializedName

class DogsResponse (
    @SerializedName("status")  var status:String,
    @SerializedName("message") var images:List<String>)