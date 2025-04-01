package com.example.fetchrewardsandroidcodingexcercise.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.fetchrewardsandroidcodingexcercise.model.ListItem
import com.example.fetchrewardsandroidcodingexcercise.model.ListRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class ListViewModel: ViewModel() {

    val listRepository = ListRepository()

    private val _listItems = MutableStateFlow<List<ListItem>>(emptyList())
    val listItems: StateFlow<List<ListItem>> = _listItems

    fun getListData() {
        viewModelScope.launch {
            _listItems.value = listRepository.fetchData()
        }
    }

}