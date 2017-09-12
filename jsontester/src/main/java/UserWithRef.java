import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;

public class UserWithRef {
    public int id;
    public String name;

    @JsonBackReference
    public List<ItemWithRef> userItems;

    public void addItem(ItemWithRef item) {
    }

    public UserWithRef(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
