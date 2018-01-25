package com.example.gautamdhariharan.semadio.activity;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

import com.example.gautamdhariharan.semadio.R;
import com.example.gautamdhariharan.semadio.other.ScreenParam;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class contactUs extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_us);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
        TextView head=(TextView) findViewById(R.id.cushead);
        head.setText(Html.fromHtml("<h2>Contact Us</h2>"));
        TextView body=(TextView) findViewById(R.id.custext);
        body.setText(Html.fromHtml("<p>Phone: <br><strong>+91 9999000010</strong></p>\n" +
                "<p>E-Mail:<br><strong>aedainc@gmail.com</strong></p>\n" +
                "<p>Address:<br><strong>#100, wdfnfownfo road, <br>1st cross, 1st main, <br>koramangala, bangalore-560034</strong></p>\n"));

    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng aedahq = new LatLng(12.931743, 77.637215);
        mMap.addMarker(new MarkerOptions().position(aedahq).title("Aeda Inc HQ"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(aedahq));
    }
}
