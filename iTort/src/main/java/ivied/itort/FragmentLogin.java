package ivied.itort;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import roboguice.RoboGuice;
import roboguice.activity.RoboFragmentActivity;
import roboguice.fragment.RoboFragment;
import roboguice.inject.ContentView;
import roboguice.inject.InjectView;

/**
 * Created by Serv on 01.12.13.
 */
public class FragmentLogin extends RoboFragment implements View.OnClickListener {
    @InjectView(R.id.editTextEmailAddress) EditText editTextEmailAddress;
    @InjectView(R.id.editTextPassword)     EditText editTextPassword;
    @InjectView(R.id.buttonLogin)          Button buttonLogin;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_login, container, false);
    }

    @Override
    public void onStart() {
        super.onStart();
        buttonLogin.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        editTextEmailAddress.setText(editTextEmailAddress.getText().toString() + editTextPassword.getText());
    }

    /*@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        editTextEmailAddress.setText("omg");

    }*/

}
