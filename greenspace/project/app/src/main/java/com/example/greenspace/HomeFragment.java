package com.example.greenspace;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class HomeFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // initiliase view

        View view = inflater.inflate(R.layout.fragment_home, container, false);

        //initialise map fragment

        SupportMapFragment supportMapFragment = (SupportMapFragment)
                getChildFragmentManager().findFragmentById(R.id.maps);

        //Async Map
        supportMapFragment.getMapAsync(new OnMapReadyCallback() {
            @Override
            public void onMapReady(@NonNull GoogleMap googleMap) {
                //When map is loaded
                googleMap.setOnMapClickListener(new GoogleMap.OnMapClickListener() {
                    @Override
                    public void onMapClick(@NonNull LatLng latLng) {
                        //When Clicked on Map
                        //intialise marker option
                        MarkerOptions markerOptions = new MarkerOptions();
                        //set postion of marker
                        markerOptions.position(latLng);
                        //set title of marker
                        markerOptions.title(latLng.latitude + " : " + latLng.longitude);
                        //Remove all markers
                        googleMap.clear();
                        //animating to zoom the marker
                        googleMap.animateCamera(CameraUpdateFactory.newLatLngZoom(
                                latLng, 5
                        ));
                        //add marker on map
                        googleMap.addMarker(markerOptions);
                    }
                });
            }
        });

        //Return View
        return view;
    }
}