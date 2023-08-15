package com.churchapplication.testapplication;


import android.content.Context;
import android.os.Bundle;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.UiThread;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import com.naver.maps.geometry.LatLng;
import com.naver.maps.map.MapFragment;
import com.naver.maps.map.MapView;
import com.naver.maps.map.NaverMap;
import com.naver.maps.map.OnMapReadyCallback;
import com.naver.maps.map.overlay.Marker;

import java.util.Map;

public class yschmap extends AppCompatActivity implements OnMapReadyCallback {
    private MapView mapView;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.yschmap);
       FragmentManager fm  = getSupportFragmentManager();
       MapFragment mapFragment = (MapFragment)fm.findFragmentById(R.id.map);
       if(mapFragment == null){
           mapFragment = MapFragment.newInstance();
           fm.beginTransaction().add(R.id.map, mapFragment).commit();
       }
       mapFragment.getMapAsync(this);
    }

    @UiThread
    @Override
    public void onMapReady(@NonNull NaverMap naverMap) {
        Marker marker = new Marker();

        marker.setPosition(new LatLng(35.33281516669295, 129.0392236598392));
        marker.setMap(naverMap);
    }
}
