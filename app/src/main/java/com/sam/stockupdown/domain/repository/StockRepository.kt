package com.sam.stockupdown.domain.repository

import com.sam.stockupdown.domain.model.CompanyListing
import com.sam.stockupdown.util.Resource
import kotlinx.coroutines.flow.Flow

interface StockRepository {

    suspend fun getCompanyListings(
        fetchFromRemote: Boolean,
        query: String
    ):Flow<Resource<List<CompanyListing>>>
}