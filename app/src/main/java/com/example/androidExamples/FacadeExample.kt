package com.example.androidExamples
/*
    If your Activity needs a list of books, it should be able to ask a single object for that
    list without understanding the inner workings of your local storage, cache and API client.
    Beyond keeping your Activities and Fragments code clean and concise, this lets Future You make
    any required changes to the API implementation without impacting the Activity.
*/


//interface BooksApi {
//    @GET("books")
//    fun listBooks(): Call<List<Book>>
//}
//
//val retrofit = Retrofit.Builder()
//    .baseUrl("http://www.myexampleurl.com")
//    .addConverterFactory(GsonConverterFactory.create())
//    .build()
//
//val api = retrofit.create<BooksApi>(BooksApi::class.java)

