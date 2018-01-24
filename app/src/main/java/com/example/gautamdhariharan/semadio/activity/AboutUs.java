package com.example.gautamdhariharan.semadio.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

import com.example.gautamdhariharan.semadio.R;

public class AboutUs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);
        TextView tv=(TextView) findViewById(R.id.autext);
        tv.setText(Html.fromHtml("<h2>About Us</h2>\n" +
                "<p><strong>Aeda Inc</strong> was incorporated in January 2018 by a team of engineering students with an astute sense of business. Aeda Inc was evolved with the objective of delivering a platform where young " +
                "film makers can showcase their talent by using our application as a medium of promotion and gathering viewers.</p>\n" +
                "<p>The philosophy of Aeda Inc in its entirety was carried forward under the apt and intellectual leadership of individuals like Narein Rao (BTech(CSE)),  Gautam D Hariharan (BTech(CSE)) and Jason Joy Manoj(" +
                "Btech(IEM)). Aeda Inc has established significant and sound associations with prestigious groups in the short films industry. The rich and the expansive range of services under short films promotion and hosting" +
                "  have propelled Aeda Inc to the fore. </p>"));
    }
}
