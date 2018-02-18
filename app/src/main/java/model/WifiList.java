package model;

/**
 * Created by abhinavk on 2/17/18.
 */

public class WifiList {
    public String getSsid() {
        return ssid;
    }

    public void setSsid(String ssid) {
        this.ssid = ssid;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return getSsid() + " " + getPassword();
    }

    private String ssid;
    private String password;

}
