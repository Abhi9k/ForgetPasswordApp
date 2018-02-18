package retrofit;

import java.util.List;

import model.Authentication;
import model.User;
import model.WifiList;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

/**
 * Created by abhinavk on 2/17/18.
 */

public interface UserService {
    @GET("user/{user_email}")
    Call<List<WifiList>> listWifis(@Path("user_email") String user_email);

    @GET("password/{ssid}")
    Call<WifiList> getPassword(@Path("ssid") String ssid);

    @GET("authenticated/{user_email}")
    Call<Authentication> checkAuthentication(@Path("user_email") String user_email);
}
