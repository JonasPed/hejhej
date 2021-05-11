package sandbox;

import javax.servlet.annotation.WebServlet;
import java.util.List;

@WebServlet
public class AmUrl {
    private List<Key> keys;

    public List<Key> getKeys() {
        return keys;
    }

    public void setKeys(List<Key> keys) {
        this.keys = keys;
    }
}
