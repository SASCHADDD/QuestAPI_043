package com.example.pertemuan12.view

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(
//    edit 1.1 : tambahkan parameter navigateToItemEntry
    navigateToItemEntry: () -> Unit,
//    edit 2.4 : tambahkan parameter navigateToItemUpdate
    navigateToItemUpdate:(Int) -> Unit,
    modifier: Modifier = Modifier,
    viewModel: HomeViewModel = viewModel(factory = PenyediaViewModel.Factory)
) {

}