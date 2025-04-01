package com.example.fetchrewardsandroidcodingexcercise.model

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class ListRepository() {

    suspend fun fetchData(): List<ListItem> = withContext(Dispatchers.IO)  {
        val apiResponse = RetrofitInstance.api.fetchListData()

        apiResponse
            .filterNotNull()
            .filter { !it.name.isNullOrEmpty() }
            .groupBy { it.listId }
            .toSortedMap()
            .map { group ->
                group.value.sortedBy { it.id }
            }
            .flatten()
    }
}