package its.computer.cesistant;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public class Login extends AppCompatActivity {
    RelativeLayout container;
    AnimationDrawable anim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //ActionBar actionBar = getSupportActionBar();
        //actionBar.hide();

        container = (RelativeLayout) findViewById(R.id.container);

        anim = (AnimationDrawable) container.getBackground();
        anim.setEnterFadeDuration(6000);
        anim.setExitFadeDuration(2000);
    }

    @Override
    protected void onResume() {
        super.onResume();
        if (anim != null && !anim.isRunning())
            anim.start();
    }

    @Override
    protected void onPause() {
        super.onPause();
        if (anim != null && anim.isRunning())
            anim.stop();
    }

    public void klik_login(View view) {
        Intent intent = new Intent(this,List.class);
        startActivity(intent);
    }
}
