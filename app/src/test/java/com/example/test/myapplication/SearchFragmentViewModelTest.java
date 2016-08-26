package com.example.test.myapplication;

import com.example.test.myapplication.rest.models.Song;
import com.example.test.myapplication.viewmodels.SearchFragmentViewModel;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by test on 26/08/16.
 */

public class SearchFragmentViewModelTest {

    private SearchFragmentViewModel viewModel;

    @Before
    public void setup(){
        viewModel = new SearchFragmentViewModel(null);

    }

    @Test
    public void testRecyclerViewAdapter()
    {
        Assert.assertEquals(viewModel.adapter.getItemCount(),1);
        viewModel.getSongs().add(new Song());
        Assert.assertEquals(viewModel.adapter.getItemCount(),2);
        viewModel.getSongs().add(new Song());
        Assert.assertEquals(viewModel.adapter.getItemCount(),3);
    }

}
