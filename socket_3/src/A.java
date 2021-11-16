import java.util.ArrayList;
import java.util.List;

public class A {
    private List<String> list;

    A(){
        list = new ArrayList<>();
    }

    public void setMess(String s) {
        list.add(s);
    }

    public String getMess() {
        return list.toString();
    }

    public List<String> getList() {
        return list;
    }

    public void delMess(){
        list.clear();
    }
}
