package com.example.mygroceriesstore.ui.category;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mygroceriesstore.R;
import com.example.mygroceriesstore.adapters.NavCategoryAdapter;
import com.example.mygroceriesstore.models.NavCategoryModel;

import java.util.ArrayList;
import java.util.List;

public class CategoryFragment extends Fragment {

    RecyclerView recyclerView;
    List<NavCategoryModel> categoryModelList;
    NavCategoryAdapter navCategoryAdapter;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_category,container,false);

        recyclerView = root.findViewById(R.id.cat_rec);

        //Popular item
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity(),RecyclerView.VERTICAL,false));
        categoryModelList = new ArrayList<>();
        navCategoryAdapter = new NavCategoryAdapter(getActivity(), categoryModelList);
        recyclerView.setAdapter(navCategoryAdapter);

        return root;
    }
}