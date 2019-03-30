package com.powerdev.wasta1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SearchView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView=findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        ArrayList<GroupServiceModel> groupService=new ArrayList<>();

        ArrayList<ChildServiceModel> carsService=new ArrayList<>();
        carsService.add(new ChildServiceModel("service 1"));
        carsService.add(new ChildServiceModel("service 2"));
        carsService.add(new ChildServiceModel("service 3"));
        carsService.add(new ChildServiceModel("service 4"));

        GroupServiceModel cars=new GroupServiceModel("خدمات سيارات",carsService);
        groupService.add(cars);


        ArrayList<ChildServiceModel> homeService=new ArrayList<>();
        homeService.add(new ChildServiceModel("service 1"));
        homeService.add(new ChildServiceModel("service 2"));

        GroupServiceModel homesServ=new GroupServiceModel("خدمات منزلية",homeService);
        groupService.add(homesServ);

        ArrayList<ChildServiceModel> MaintenanceElectricalDevices=new ArrayList<>();
        MaintenanceElectricalDevices.add(new ChildServiceModel("service 1"));
        MaintenanceElectricalDevices.add(new ChildServiceModel("service 2"));
        MaintenanceElectricalDevices.add(new ChildServiceModel("service 3"));
        MaintenanceElectricalDevices.add(new ChildServiceModel("service 4"));

        GroupServiceModel elctDevice=new GroupServiceModel("صيانة اجهزة كهربائية",MaintenanceElectricalDevices);
        groupService.add(elctDevice);

        ChildAdapter adapter=new ChildAdapter(groupService);
        recyclerView.setAdapter(adapter);





    }
}
