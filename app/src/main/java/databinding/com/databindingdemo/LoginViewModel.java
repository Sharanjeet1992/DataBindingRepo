package databinding.com.databindingdemo;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

/**
 * Created by sharan on 27/3/18.
 */

public class LoginViewModel extends BaseObservable {

    String username = "";
    String password = "";

    public LoginViewModel(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public LoginViewModel() {
    }

    @Bindable
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
        notifyPropertyChanged(databinding.com.databindingdemo.BR.username);
    }

    @Bindable
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
        notifyPropertyChanged(databinding.com.databindingdemo.BR.password);
    }
}
