package com.example.heels;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {
    RecyclerView recyclerView;

    List<ParentItems>parentItemsList=new ArrayList<>();
    ParentAdapater parentAdapater;
  @Nullable
        @Override
        public View onCreateView (@NonNull LayoutInflater inflater, @Nullable ViewGroup
        container, @Nullable Bundle savedInstanceState){
            View view = inflater.inflate(R.layout.fragment_home, container, false);
            recyclerView = view.findViewById(R.id.parentRecyclerView);
            recyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));
            productData();
             parentAdapater=new ParentAdapater(parentItemsList,requireContext());
            recyclerView.setAdapter(parentAdapater);
            return view;

        }
        public void productData () {


            List<ChildItems> childItemsList = new ArrayList<>();
            childItemsList.add(new ChildItems(R.drawable.cherryredmain, "Platform Heels"));
            childItemsList.add(new ChildItems(R.drawable.chaussuresheels, "Chausseures Heels"));
            childItemsList.add(new ChildItems(R.drawable.geometricaheel, "Geometric"));
            childItemsList.add(new ChildItems(R.drawable.sculptheel, "Sculpt Heels"));
            childItemsList.add(new ChildItems(R.drawable.heels, "Wedge Heels"));
            childItemsList.add(new ChildItems(R.drawable.yslheel, "Saint Laurent"));
            childItemsList.add(new ChildItems(R.drawable.babylon, "Babylon"));
            childItemsList.add(new ChildItems(R.drawable.kate, "Kate"));
            childItemsList.add(new ChildItems(R.drawable.slingbackheel, "Sling Back Heel"));



            List<ChildItems> childItemsList1 = new ArrayList<>();
            childItemsList1.add(new ChildItems(R.drawable.kittenflat, "kitten Flat"));
            childItemsList1.add(new ChildItems(R.drawable.beigeflat, "Beige Flat"));
            childItemsList1.add(new ChildItems(R.drawable.browngoldenflat, "brown &Golden Flat"));
            childItemsList1.add(new ChildItems(R.drawable.darkbrownflat, "Dark Brown flat"));
            childItemsList1.add(new ChildItems(R.drawable.brownwhiteflat, "Brown White Flat"));
            childItemsList1.add(new ChildItems(R.drawable.browndoublestrap, "Brown Double Strap"));
            childItemsList1.add(new ChildItems(R.drawable.summershoes, "Summer Shoes"));
            childItemsList1.add(new ChildItems(R.drawable.sandaliasnegras, "Sandalia "));
            childItemsList1.add(new ChildItems(R.drawable.whiteflat, "White flat"));


            List<ChildItems> childItemsList2 = new ArrayList<>();
            childItemsList2.add(new ChildItems(R.drawable.boots, "Boots"));
            childItemsList2.add(new ChildItems(R.drawable.blackboot, "Black Boots"));
            childItemsList2.add(new ChildItems(R.drawable.blackbootcasual, "Black Casual Boots"));
            childItemsList2.add(new ChildItems(R.drawable.brownboots, "Brown Boots"));
            childItemsList2.add(new ChildItems(R.drawable.blackshinnyboots, "Black Shiny Boots"));
            childItemsList2.add(new ChildItems(R.drawable.brownleatherboots, "Leather brown Boots"));
            childItemsList2.add(new ChildItems(R.drawable.brownleatheryboot, "Brown boots"));
            childItemsList2.add(new ChildItems(R.drawable.whiteboots, "White Boots"));
            childItemsList2.add(new ChildItems(R.drawable.olivegreenboots, "olive Green Boots"));


            List<ChildItems> childItemsList3 = new ArrayList<>();
            childItemsList3.add(new ChildItems(R.drawable.balletpumps, "Ballet Pumps"));
            childItemsList3.add(new ChildItems(R.drawable.brownpumps, "Brown Pumps"));
            childItemsList3.add(new ChildItems(R.drawable.beigepumps, "Beige Pumps"));
            childItemsList3.add(new ChildItems(R.drawable.cherryredpumps, "Cherry Red Pumps"));
            childItemsList3.add(new ChildItems(R.drawable.whitebrownpumps, "White Brown Pumps"));
            childItemsList3.add(new ChildItems(R.drawable.navybluepumps, "NAvy Blue Pumps"));
            childItemsList3.add(new ChildItems(R.drawable.maryjanepumps, "Mary Jane pumps"));
            childItemsList3.add(new ChildItems(R.drawable.olivegreenpumps, "Olive Green Pumps"));
            childItemsList3.add(new ChildItems(R.drawable.goldenmaroonpumps, "Golden Maroon Pumps"));
            childItemsList3.add(new ChildItems(R.drawable.greysihpumps, "Grey Pumps"));


            List<ChildItems> childItemsList4 = new ArrayList<>();
            childItemsList4.add(new ChildItems(R.drawable.adidassnekers, "Adidas Sneakers"));
            childItemsList4.add(new ChildItems(R.drawable.hightopsneakers, "High Top Sneakers"));
            childItemsList4.add(new ChildItems(R.drawable.nikesneakers, "Nike Sneakers"));
            childItemsList4.add(new ChildItems(R.drawable.pumaspeedcat, "Puma Speed Cat"));
            childItemsList4.add(new ChildItems(R.drawable.pinksneakers, "Pink Sneakers"));
            childItemsList4.add(new ChildItems(R.drawable.maroonconverse, "Maroon converse"));
            childItemsList4.add(new ChildItems(R.drawable.whitebrownsneakers, "White Brown Sneakers"));
            childItemsList4.add(new ChildItems(R.drawable.blackconverse, "Black converse"));
            childItemsList4.add(new ChildItems(R.drawable.navybluesneakers, "Navy Blue Sneakers"));
            childItemsList4.add(new ChildItems(R.drawable.pinkgreenadidas, "Pink&Green Adidas"));
            childItemsList4.add(new ChildItems(R.drawable.sambas, "Sambas"));

            parentItemsList.add(
                    new ParentItems("Heels", childItemsList)
            );

            parentItemsList.add(
                    new ParentItems("Flats", childItemsList1)
            );

            parentItemsList.add(
                    new ParentItems("Boots", childItemsList2)
            );

            parentItemsList.add(
                    new ParentItems("Pumps", childItemsList3)
            );

            parentItemsList.add(
                    new ParentItems("Sneakers", childItemsList4)
            );

            recyclerView.setAdapter(new ParentAdapater(parentItemsList,requireContext()));


        }
    }



