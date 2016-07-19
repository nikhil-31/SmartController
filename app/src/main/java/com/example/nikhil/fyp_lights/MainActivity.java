package com.example.nikhil.fyp_lights;

import android.app.VoiceInteractor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONObject;
import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button one,two,three,four,five,six,seven,eight;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        one= (Button) findViewById(R.id.one);
        two= (Button) findViewById(R.id.two);
        three= (Button) findViewById(R.id.three);
        four= (Button) findViewById(R.id.four);
        five= (Button) findViewById(R.id.five);
        six= (Button) findViewById(R.id.six);
        seven= (Button) findViewById(R.id.seven);
        eight= (Button) findViewById(R.id.eight);


        one.setOnClickListener(this);
        two.setOnClickListener(this);
        three.setOnClickListener(this);
        four.setOnClickListener(this);
        five.setOnClickListener(this);
        six.setOnClickListener(this);
        seven.setOnClickListener(this);
        eight.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.one:
                final RequestQueue Queue = Volley.newRequestQueue(MainActivity.this);
                Map<String, String> Parameters = new HashMap<String, String>();
                JsonObjectRequest jsonObjReq = new JsonObjectRequest(Request.Method.POST, "http://lightsfinal.ddns.net:8000/GPIO/17/function/out" , new JSONObject(Parameters), new Response.Listener<JSONObject>() {

                    @Override
                    public void onResponse(JSONObject response) {

                    }

                }, new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError volleyError) {
                        //Handel the errors here
                    }
                });
                Queue.add(jsonObjReq);



                String URL="";
                if(one.getText().toString().matches("ON"))
                    URL="http://lightsfinal.ddns.net:8000/GPIO/17/value/1";
                else
                    URL="http://lightsfinal.ddns.net:8000/GPIO/17/value/0";
                Map<String, String> Parameters2 = new HashMap<String, String>();
                if(one.getText().toString().matches("ON"))
                    one.setText("OFF");
                else one.setText("ON");
                JsonObjectRequest jsonObjReq2 = new JsonObjectRequest(Request.Method.POST,URL, new JSONObject(Parameters2), new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {

                    }

                }, new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError volleyError) {
                        //Handle the errors here
                    }
                });
                Queue.add(jsonObjReq2);
                break;

            case R.id.two:
                final RequestQueue Queue2 = Volley.newRequestQueue(MainActivity.this);
                Map<String, String> Parameters3 = new HashMap<String, String>();
                JsonObjectRequest jsonObjReq3 = new JsonObjectRequest(Request.Method.POST, "http://lightsfinal.ddns.net:8000/GPIO/18/function/out" , new JSONObject(Parameters3), new Response.Listener<JSONObject>() {

                    @Override
                    public void onResponse(JSONObject response) {

                    }

                }, new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError volleyError) {
                        //Handel the errors here
                    }
                });
                Queue2.add(jsonObjReq3);



                String URL1="";
                if(two.getText().toString().matches("ON"))
                    URL1="http://lightsfinal.ddns.net:8000/GPIO/18/value/1";
                else
                    URL1="http://lightsfinal.ddns.net:8000/GPIO/18/value/0";
                Map<String, String> Parameters4 = new HashMap<String, String>();
                if(two.getText().toString().matches("ON"))
                    two.setText("OFF");
                else two.setText("ON");
                JsonObjectRequest jsonObjReq4 = new JsonObjectRequest(Request.Method.POST,URL1, new JSONObject(Parameters4), new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {

                    }

                }, new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError volleyError) {
                        //Handle the errors here
                    }
                });
                Queue2.add(jsonObjReq4);
                break;

            case R.id.three:
            final RequestQueue Queue3 = Volley.newRequestQueue(MainActivity.this);
            Map<String, String> Parameters5 = new HashMap<String, String>();
            JsonObjectRequest jsonObjReq5 = new JsonObjectRequest(Request.Method.POST, "http://lightsfinal.ddns.net:8000/GPIO/27/function/out" , new JSONObject(Parameters5), new Response.Listener<JSONObject>() {

                @Override
                public void onResponse(JSONObject response) {

                }

            }, new Response.ErrorListener() {
                @Override
                public void onErrorResponse(VolleyError volleyError) {
                    //Handel the errors here
                }
            });
            Queue3.add(jsonObjReq5);



            String URL2="";
            if(three.getText().toString().matches("ON"))
                URL2="http://lightsfinal.ddns.net:8000/GPIO/27/value/1";
            else
                URL2="http://lightsfinal.ddns.net:8000/GPIO/27/value/0";
            Map<String, String> Parameters6 = new HashMap<String, String>();
            if(three.getText().toString().matches("ON"))
                three.setText("OFF");
            else three.setText("ON");
            JsonObjectRequest jsonObjReq6 = new JsonObjectRequest(Request.Method.POST,URL2, new JSONObject(Parameters6), new Response.Listener<JSONObject>() {
                @Override
                public void onResponse(JSONObject response) {

                }

            }, new Response.ErrorListener() {
                @Override
                public void onErrorResponse(VolleyError volleyError) {
                    //Handle the errors here
                }
            });
            Queue3.add(jsonObjReq6);
            break;

            case R.id.four:
                final RequestQueue Queue4 = Volley.newRequestQueue(MainActivity.this);
                Map<String, String> Parameters7 = new HashMap<String, String>();
                JsonObjectRequest jsonObjReq7 = new JsonObjectRequest(Request.Method.POST, "http://lightsfinal.ddns.net:8000/GPIO/22/function/out" , new JSONObject(Parameters7), new Response.Listener<JSONObject>() {

                    @Override
                    public void onResponse(JSONObject response) {

                    }

                }, new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError volleyError) {
                        //Handel the errors here
                    }
                });
                Queue4.add(jsonObjReq7);



                String URL3="";
                if(four.getText().toString().matches("ON"))
                    URL3="http://lightsfinal.ddns.net:8000/GPIO/22/value/1";
                else
                    URL3="http://lightsfinal.ddns.net:8000/GPIO/22/value/0";
                Map<String, String> Parameters8 = new HashMap<String, String>();
                if(four.getText().toString().matches("ON"))
                    four.setText("OFF");
                else four.setText("ON");
                JsonObjectRequest jsonObjReq8 = new JsonObjectRequest(Request.Method.POST,URL3, new JSONObject(Parameters8), new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {

                    }

                }, new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError volleyError) {
                        //Handle the errors here
                    }
                });
                Queue4.add(jsonObjReq8);
                break;

            case R.id.five:
                final RequestQueue Queue5 = Volley.newRequestQueue(MainActivity.this);
                Map<String, String> Parameters9 = new HashMap<String, String>();
                JsonObjectRequest jsonObjReq9 = new JsonObjectRequest(Request.Method.POST, "http://lightsfinal.ddns.net:8000/GPIO/23/function/out" , new JSONObject(Parameters9), new Response.Listener<JSONObject>() {

                    @Override
                    public void onResponse(JSONObject response) {

                    }

                }, new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError volleyError) {
                        //Handel the errors here
                    }
                });
                Queue5.add(jsonObjReq9);



                String URL4="";
                if(five.getText().toString().matches("ON"))
                    URL4="http://lightsfinal.ddns.net:8000/GPIO/23/value/1";
                else
                    URL4="http://lightsfinal.ddns.net:8000/GPIO/23/value/0";
                Map<String, String> Parameters10 = new HashMap<String, String>();
                if(five.getText().toString().matches("ON"))
                    five.setText("OFF");
                else five.setText("ON");
                JsonObjectRequest jsonObjReq10 = new JsonObjectRequest(Request.Method.POST,URL4, new JSONObject(Parameters10), new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {

                    }

                }, new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError volleyError) {
                        //Handle the errors here
                    }
                });
                Queue5.add(jsonObjReq10);
                break;

            case R.id.six:
                final RequestQueue Queue6 = Volley.newRequestQueue(MainActivity.this);
                Map<String, String> Parameters11 = new HashMap<String, String>();
                JsonObjectRequest jsonObjReq11 = new JsonObjectRequest(Request.Method.POST, "http://lightsfinal.ddns.net:8000/GPIO/24/function/out" , new JSONObject(Parameters11), new Response.Listener<JSONObject>() {

                    @Override
                    public void onResponse(JSONObject response) {

                    }

                }, new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError volleyError) {
                        //Handel the errors here
                    }
                });
                Queue6.add(jsonObjReq11);



                String URL5="";
                if(six.getText().toString().matches("ON"))
                    URL5="http://lightsfinal.ddns.net:8000/GPIO/24/value/1";
                else
                    URL5="http://lightsfinal.ddns.net:8000/GPIO/24/value/0";
                Map<String, String> Parameters12 = new HashMap<String, String>();
                if(six.getText().toString().matches("ON"))
                    six.setText("OFF");
                else six.setText("ON");
                JsonObjectRequest jsonObjReq12 = new JsonObjectRequest(Request.Method.POST,URL5, new JSONObject(Parameters12), new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {

                    }

                }, new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError volleyError) {
                        //Handle the errors here
                    }
                });
                Queue6.add(jsonObjReq12);
                break;

            case R.id.seven:
                final RequestQueue Queue7 = Volley.newRequestQueue(MainActivity.this);
                Map<String, String> Parameters13 = new HashMap<String, String>();
                JsonObjectRequest jsonObjReq13 = new JsonObjectRequest(Request.Method.POST, "http://lightsfinal.ddns.net:8000/GPIO/10/function/out" , new JSONObject(Parameters13), new Response.Listener<JSONObject>() {

                    @Override
                    public void onResponse(JSONObject response) {

                    }

                }, new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError volleyError) {
                        //Handel the errors here
                    }
                });
                Queue7.add(jsonObjReq13);



                String URL6="";
                if(seven.getText().toString().matches("ON"))
                    URL4="http://lightsfinal.ddns.net:8000/GPIO/10/value/1";
                else
                    URL4="http://lightsfinal.ddns.net:8000/GPIO/10/value/0";
                Map<String, String> Parameters14 = new HashMap<String, String>();
                if(seven.getText().toString().matches("ON"))
                    seven.setText("OFF");
                else seven.setText("ON");
                JsonObjectRequest jsonObjReq14 = new JsonObjectRequest(Request.Method.POST,URL4, new JSONObject(Parameters14), new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {

                    }

                }, new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError volleyError) {
                        //Handle the errors here
                    }
                });
                Queue7.add(jsonObjReq14);
                break;

            case R.id.eight:
                final RequestQueue Queue8 = Volley.newRequestQueue(MainActivity.this);
                Map<String, String> Parameters15 = new HashMap<String, String>();
                JsonObjectRequest jsonObjReq15 = new JsonObjectRequest(Request.Method.POST, "http://lightsfinal.ddns.net:8000/GPIO/09/function/out" , new JSONObject(Parameters15), new Response.Listener<JSONObject>() {

                    @Override
                    public void onResponse(JSONObject response) {

                    }

                }, new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError volleyError) {
                        //Handel the errors here
                    }
                });
                Queue8.add(jsonObjReq15);



                String URL7="";
                if(eight.getText().toString().matches("ON"))
                    URL7="http://lightsfinal.ddns.net:8000/GPIO/09/value/1";
                else
                    URL7="http://lightsfinal.ddns.net:8000/GPIO/09/value/0";
                Map<String, String> Parameters16 = new HashMap<String, String>();
                if(eight.getText().toString().matches("ON"))
                    eight.setText("OFF");
                else eight.setText("ON");
                JsonObjectRequest jsonObjReq16 = new JsonObjectRequest(Request.Method.POST,URL7, new JSONObject(Parameters16), new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {

                    }

                }, new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError volleyError) {
                        //Handle the errors here
                    }
                });
                Queue8.add(jsonObjReq16);
                break;
        }
    }
}