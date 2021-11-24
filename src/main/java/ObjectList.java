import java.util.Arrays;

public class ObjectList {
    private int len;
    public Object[] objArr;

    public ObjectList(int len) {
        this.len = len;
        this.objArr = (Object[]) objArr[len];
    }

    public void add(Object o) {
        Object[] myObjArr = this.objArr;
        Object[] myArr = Arrays.copyOf(myObjArr, myObjArr.length + 1);
        myArr[myArr.length-1] = o;
        this.objArr = myArr;
    }



}
