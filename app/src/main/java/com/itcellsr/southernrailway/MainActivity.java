package com.itcellsr.southernrailway;


import android.content.Intent;
        import android.os.Handler;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.RelativeLayout;
        import android.widget.Toast;

        public class MainActivity extends AppCompatActivity

{


    RelativeLayout rellay1, rellay2;
    Button btn1;
    EditText Text1, Pas2;
    String t1,p1,div;

    Handler handler = new Handler();
    Runnable runnable = new Runnable()
    {
        @Override
        public void run()
        {
            rellay1.setVisibility(View.VISIBLE);
            rellay2.setVisibility(View.VISIBLE);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rellay1 = (RelativeLayout) findViewById(R.id.rellay1);
        rellay2 = (RelativeLayout) findViewById(R.id.rellay2);

        handler.postDelayed(runnable, 2000); //2000 is the timeout for the splash

        btn1 = (Button) findViewById(R.id.button2);
        Text1 = (EditText) findViewById(R.id.Text1);
        Pas2 = (EditText) findViewById(R.id.Pas2);
        btn1.setOnClickListener(new View.OnClickListener()
        {
            private String text1;
            private String pas2;

            @Override
            public void onClick(View v)
            {
                if (Text1.getText().toString().isEmpty())
                {
                    if (Pas2.getText().toString().isEmpty())
                    {
                        Toast.makeText(getApplicationContext(), "Please check username and password", Toast.LENGTH_SHORT).show();
                    } else
                    {
                        Toast.makeText(getApplicationContext(), "Please check username ", Toast.LENGTH_SHORT).show();
                    }
                }
                else if (Pas2.getText().toString().isEmpty())
                {

                    Toast.makeText(getApplicationContext(), "Please check password", Toast.LENGTH_SHORT).show();

                }
                Intent intent = null;
                t1 = Text1.getText().toString().toLowerCase();
                p1=Pas2.getText().toString().toLowerCase();
                if(t1.equals("ccmpm") && p1.equals("12345"))
                    intent = new Intent(MainActivity.this, Bossuser.class);
                else if(t1.equals("dyccmpm") && p1.equals("1234"))
                    intent = new Intent(MainActivity.this, Bossuser.class);
                else if(t1.equals("scm") && p1.equals("123"))
                    intent = new Intent(MainActivity.this, Bossuser.class);
                else if(t1.equals("srdcmmdu") && p1.equals("12")) {
                    intent = new Intent(MainActivity.this, Srdcm.class);
                    div="mdu";
                    intent.putExtra("div2",div) ;
                }
                else if(t1.equals("srdcmtvc") && p1.equals("12")) {
                    intent = new Intent(MainActivity.this, Srdcm.class);
                    div = "tvc";
                }
                else if(t1.equals("srdcmmas") && p1.equals("12")) {
                    intent = new Intent(MainActivity.this, Srdcm.class);
                    div = "mas";

                }
                else if(t1.equals("srdcmtpj") && p1.equals("12")) {
                    intent = new Intent(MainActivity.this, Srdcm.class);
                    div = "tpj";
                }
                else if(t1.equals("srdcmpgt") && p1.equals("12")) {
                    intent = new Intent(MainActivity.this, Srdcm.class);
                    div = "pgt";
                }
                else if(t1.equals("srdcmsa") && p1.equals("12")) {
                    intent = new Intent(MainActivity.this, Srdcm.class);
                    div ="sa";
                }
                else if(t1.equals("fu") && p1.equals("1"))
                    intent = new Intent(MainActivity.this, Fieldusers.class);
                else {
                    Toast.makeText(getApplicationContext(), "Please check username and password", Toast.LENGTH_SHORT).show();
                    intent = new Intent(MainActivity.this, Loginscreen.class);
                }
                startActivity(intent);
            }
        });
    }
}
