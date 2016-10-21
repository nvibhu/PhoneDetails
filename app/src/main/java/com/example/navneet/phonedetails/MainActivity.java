package com.example.navneet.phonedetails;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.telephony.TelephonyManager;
import android.text.Html;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TelephonyManager tel;
    TextView text1;
    TextView text2;
    String ModelNumber, Board, Brand, Display, FingerPrint, ID, TAGS, Type,
            AndroidVersion, APILevel, CodeName, INCREMENTAL;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tel = (TelephonyManager) getSystemService(Context.TELEPHONY_SERVICE);
        text1 = (TextView) findViewById(R.id.textView1);

        ModelNumber = android.os.Build.MODEL;
        Board = android.os.Build.BOARD;
        Brand = android.os.Build.BRAND;
        Display = android.os.Build.DISPLAY;
        FingerPrint = android.os.Build.FINGERPRINT;
        ID = android.os.Build.ID;
        TAGS = android.os.Build.TAGS;
        Type = android.os.Build.TYPE;

        AndroidVersion = android.os.Build.VERSION.RELEASE;
        APILevel = android.os.Build.VERSION.SDK;
        CodeName = android.os.Build.VERSION.CODENAME;
        INCREMENTAL = android.os.Build.VERSION.INCREMENTAL;

        text2 = (TextView) findViewById(R.id.textView2);

        text1.setText(Html.fromHtml("<b>Operator Details :</b>"
                + "<br/><br/><font color = '#003300';> Operator Code : </font>" + tel.getNetworkOperator().toString()
                + "<br/><font color = '#003300';> Subscriber ID : </font>" + tel.getSubscriberId().toString()
                + "<br/><font color = '#003300';> Operator Name : </font>" + tel.getNetworkOperatorName().toString()
                + "<br/><font color = '#003300';> Network Type : </font>" + tel.getNetworkType()
                + "<br/><font color = '#003300';> Country ISO : </font>" + tel.getNetworkCountryIso().toString()
                + "<br/><font color = '#003300';> Serial Number : </font>" + tel.getSimSerialNumber().toString()
                + "<br/><font color = '#003300';> Mobile Number : </font>" + tel.getLine1Number().toString()
                + "<br/><br/><b>Phone Details :</b>"
                + "<br/><br/><font color = '#997300';>Model Number : </font>" + ModelNumber
                + "<br/><font color = '#997300';>Board : </font>" + Board
                + "<br/><font color = '#997300';>Brand : </font>" + Brand
                + "<br/><font color = '#997300';>Display : </font>" + Display
                + "<br/><font color = '#997300';>FingerPrint : </font>" + FingerPrint
                + "<br/><font color = '#997300';>ID : </font>" + ID
                + "<br/><font color = '#997300';>TAGS : </font>" + TAGS
                + "<br/><font color = '#997300';>Type : </font>" + Type
                + "<br/><br/><b>Operating System Details :</b>"
                + "<br/><br/><font color = '#b30047';>Android Version : </font>" + AndroidVersion
                + "<br/><font color = '#b30047';>API Level : </font>" + APILevel
                + "<br/><font color = '#b30047';>CodeName : </font>" + CodeName
                + "<br/><font color = '#b30047';>INCREMENTAL : </font>" + INCREMENTAL));
    }
}
