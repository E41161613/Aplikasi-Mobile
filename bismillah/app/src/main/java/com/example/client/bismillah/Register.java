package com.example.client.bismillah;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.example.client.bismillah.chiel.AppController;
import org.json.JSONException;
import org.json.JSONObject;
import java.util.HashMap;
import java.util.Map;

public class Register extends AppCompatActivity {

    ProgressDialog pDialog;
    Button btn_register, btn_login;
<<<<<<< HEAD
    EditText txt_nama,txt_username, txt_password,txt_confirm_password,txt_noHP,txt_alamat, txt_email;
=======
    EditText txt_nama,txt_username, txt_password,txt_confirm_password,txt_noHP,txt_alamat;
>>>>>>> 5a4846e67105d2bdbe1e167aab1d1b03f91daaa4

    Intent intent;

    int success;
    ConnectivityManager conMgr;

    private String url = server.URL + "Register.php";
    private static final String TAG = Register.class.getSimpleName();
    private static final String TAG_SUCCESS = "success";
    private static final String TAG_MESSAGE = "message";
    String tag_json_obj = "json_obj_req";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);

        conMgr = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        {
            if (conMgr.getActiveNetworkInfo() != null
                    && conMgr.getActiveNetworkInfo().isAvailable()
                    && conMgr.getActiveNetworkInfo().isConnected()) {
            } else {
                Toast.makeText(getApplicationContext(), "No Internet Connection",
                        Toast.LENGTH_LONG).show();
            }
        }

        btn_login = (Button) findViewById(R.id.btn_login);
        btn_register = (Button) findViewById(R.id.btn_register);
        txt_nama = (EditText) findViewById(R.id.txt_nama);
        txt_username = (EditText) findViewById(R.id.txt_username);
        txt_password = (EditText) findViewById(R.id.txt_password);
        txt_confirm_password = (EditText) findViewById(R.id.txt_confirm_password);
        txt_noHP = (EditText) findViewById(R.id.txt_noHP);
        txt_alamat = (EditText) findViewById(R.id.txt_alamat);
<<<<<<< HEAD
        txt_email = (EditText) findViewById(R.id.txt_email);
=======
>>>>>>> 5a4846e67105d2bdbe1e167aab1d1b03f91daaa4



        btn_login.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                intent = new Intent(Register.this, login.class);
                finish();
                startActivity(intent);
            }
        });

        btn_register.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub

                String nama = txt_nama.getText().toString();
                String username = txt_username.getText().toString();
                String password = txt_password.getText().toString();
                String confirm_password = txt_confirm_password.getText().toString();
                String noHp = txt_noHP.getText().toString();
                String alamat = txt_alamat.getText().toString();
<<<<<<< HEAD
                String email = txt_email.getText().toString();
=======
>>>>>>> 5a4846e67105d2bdbe1e167aab1d1b03f91daaa4


                if (conMgr.getActiveNetworkInfo() != null
                        && conMgr.getActiveNetworkInfo().isAvailable()
                        && conMgr.getActiveNetworkInfo().isConnected()) {
<<<<<<< HEAD
                    checkRegister(nama,username, password, confirm_password,noHp,alamat,email);
=======
                    checkRegister(nama,username, password, confirm_password,noHp,alamat);
>>>>>>> 5a4846e67105d2bdbe1e167aab1d1b03f91daaa4
                } else {
                    Toast.makeText(getApplicationContext(), "No Internet Connection", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }



<<<<<<< HEAD
    private void checkRegister(final String nama,final String username, final String password, final String confirm_password,final String noHP,final String alamat,final String email) {
=======
    private void checkRegister(final String nama,final String username, final String password, final String confirm_password,final String noHP,final String alamat) {
>>>>>>> 5a4846e67105d2bdbe1e167aab1d1b03f91daaa4
        pDialog = new ProgressDialog(this);
        pDialog.setCancelable(false);
        pDialog.setMessage("Register ...");
        showDialog();

        StringRequest strReq = new StringRequest(Request.Method.POST, url, new Response.Listener<String>() {

            @Override
            public void onResponse(String response) {
                Log.e(TAG, "Register Response: " + response.toString());
                hideDialog();

                try {
                    JSONObject jObj = new JSONObject(response);
                    success = jObj.getInt(TAG_SUCCESS);

                    // Check for error node in json
                    if (success == 1) {

                        Log.e("Successfully Register!", jObj.toString());

                        Toast.makeText(getApplicationContext(),
                                jObj.getString(TAG_MESSAGE), Toast.LENGTH_LONG).show();

                        txt_nama.setText("");
                        txt_username.setText("");
                        txt_password.setText("");
                        txt_confirm_password.setText("");
                        txt_noHP.setText("");
                        txt_alamat.setText("");
<<<<<<< HEAD
                        txt_email.setText("");
=======
>>>>>>> 5a4846e67105d2bdbe1e167aab1d1b03f91daaa4

                    } else {
                        Toast.makeText(getApplicationContext(),
                                jObj.getString(TAG_MESSAGE), Toast.LENGTH_LONG).show();

                    }
                } catch (JSONException e) {

                    // JSON error
                    Toast.makeText(getApplicationContext(),"uhuhuh",Toast.LENGTH_SHORT).show();
                    e.printStackTrace();
                }

            }
        }, new Response.ErrorListener() {

            @Override
            public void onErrorResponse(VolleyError error) {
                Log.e(TAG, "Login Error: " + error.getMessage());
                Toast.makeText(getApplicationContext(),
                        error.getMessage()+"ijjijijijij", Toast.LENGTH_LONG).show();

                hideDialog();

            }
        }) {

            @Override
            protected Map<String, String> getParams() {
                // Posting parameters to login url
                Map<String, String> params = new HashMap<String, String>();
                params.put("nama", nama);
                params.put("username", username);
                params.put("password", password);
                params.put("confirm_password", confirm_password);
                params.put("noHP", noHP);
                params.put("alamat", alamat);
<<<<<<< HEAD
                params.put("email", email);
=======
>>>>>>> 5a4846e67105d2bdbe1e167aab1d1b03f91daaa4


                return params;
            }

        };

        // Adding request to request queue
        AppController.getInstance().addToRequestQueue(strReq, tag_json_obj);
    }

    private void showDialog() {
        if (!pDialog.isShowing())
            pDialog.show();
    }

    private void hideDialog() {
        if (pDialog.isShowing())
            pDialog.dismiss();
    }

    @Override
    public void onBackPressed() {
        intent = new Intent(Register.this, login.class);
        finish();
        startActivity(intent);
    }

}