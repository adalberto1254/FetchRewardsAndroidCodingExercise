package com.example.fetchrewardsandroidcodingexcercise.view

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import com.example.fetchrewardsandroidcodingexcercise.model.ListItem

@Composable
fun CustomListItem(modifier: Modifier = Modifier, itemData: ListItem) {
    Row(
        modifier
            .fillMaxWidth()
            .wrapContentHeight()
            .clip(RoundedCornerShape(8.dp))
            .background(color = androidx.compose.ui.graphics.Color.LightGray)
            .padding(16.dp)

    ) {
        Text(modifier = Modifier.weight(1f), text = "id: ${itemData.id}")
        Text(modifier = Modifier.weight(1f), text = "listId: ${itemData.listId}")
        Text(modifier = Modifier.weight(2f), text = "name: ${itemData.name}")
    }
}