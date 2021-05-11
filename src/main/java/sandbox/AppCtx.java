package sandbox;

import com.fasterxml.jackson.annotation.JsonRootName;

public class AppCtx {
    private String msexchuid;
    private String version;
    private String amurl;

    public String getAmurl() {
        return amurl;
    }

    public void setAmurl(String amurl) {
        this.amurl = amurl;
    }

    public String getMsexchuid() {
        return msexchuid;
    }

    public void setMsexchuid(String msexchuid) {
        this.msexchuid = msexchuid;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}
