package com.example.paginationjavademo;

import androidx.lifecycle.MutableLiveData;
import androidx.paging.DataSource;
import androidx.paging.PageKeyedDataSource;

public class ItemDataSourceFactory extends DataSource.Factory {



    private MutableLiveData<PageKeyedDataSource<Integer,Item>> itemLiveDataSourece=new MutableLiveData<>();

    @Override
    public DataSource create() {
        ItemDataSource itemDataSource= new ItemDataSource();
        itemLiveDataSourece.postValue(itemDataSource);
        return itemDataSource;
    }

    public MutableLiveData<PageKeyedDataSource<Integer, Item>> getItemLiveDataSourece() {
        return itemLiveDataSourece;
    }
}
