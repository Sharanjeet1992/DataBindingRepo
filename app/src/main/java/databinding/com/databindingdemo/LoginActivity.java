package databinding.com.databindingdemo;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import databinding.com.databindingdemo.databinding.LoginXmlBinding;

public class LoginActivity extends AppCompatActivity {
    private static final String TAG = LoginActivity.class.getSimpleName();
    LoginXmlBinding loginXmlBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        loginXmlBinding = DataBindingUtil.setContentView(this, R.layout.login_xml);
        loginXmlBinding.setLoginViewModel(new LoginViewModel());
        loginXmlBinding.setActivity(this);
    }

    public void onLoginButtonClick(String username,String password) {

        Log.d(TAG, "Username :" + loginXmlBinding.getLoginViewModel().getUsername());
        Log.d(TAG, "Password : " + loginXmlBinding.getLoginViewModel().getPassword());
        Log.d(TAG, "Username param :" + username);
        Log.d(TAG, "Password param : " + password);
    }
}
