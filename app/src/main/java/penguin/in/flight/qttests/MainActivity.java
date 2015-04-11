package penguin.in.flight.qttests;

import android.app.AlertDialog;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import penguin.in.flight.qttests.utils.JavaNatives;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        JavaNatives.init(this);
        findViewById(R.id.hi_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showHelloMessage();
            }
        });
    }

    private void showHelloMessage() {
        AlertDialog.Builder dialog = new AlertDialog.Builder(this);
        dialog.setMessage(JavaNatives.sayHello());
        dialog.setPositiveButton("Ok", null);
        dialog.show();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
