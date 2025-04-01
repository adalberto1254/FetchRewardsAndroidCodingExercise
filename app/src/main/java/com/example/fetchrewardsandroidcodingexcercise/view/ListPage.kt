package com.example.fetchrewardsandroidcodingexcercise.view

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.fetchrewardsandroidcodingexcercise.viewmodel.ListViewModel

@Composable
fun ListPage(modifier: Modifier = Modifier, viewModel: ListViewModel) {
    viewModel.getListData()
    val listItems by viewModel.listItems.collectAsState()
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(top = 24.dp)
    ) {
        Text(
            modifier = Modifier
                .padding(start = 16.dp),
            fontSize = 32.sp,
            fontWeight = androidx.compose.ui.text.font.FontWeight.Bold,
            text = "List of Items",
        )


        LazyColumn(
            modifier = modifier
                .fillMaxWidth()
                .fillMaxHeight(1f)
                .padding(horizontal = 16.dp)
        ) {
            items(listItems) { item ->
                CustomListItem(itemData = item)
                Spacer(modifier = Modifier.padding(4.dp))
            }
        }
    }

}