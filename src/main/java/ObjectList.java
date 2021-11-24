import java.util.Arrays;

public class ObjectList {
    private int len;
    public Object[] objArr;

    public ObjectList() {
        this.objArr = new Object[0]; // tutaj mialem blad
    }

    public void add(Object o) {
        Object[] myObjArr = this.objArr;
        Object[] myArr = Arrays.copyOf(myObjArr, myObjArr.length + 1);
        myArr[myArr.length-1] = o;
        this.objArr = myArr;
    }

    public Object get(int index) {
         try {
             return this.objArr[index];
         } catch (ArrayIndexOutOfBoundsException e) {
             System.out.println("There is no such index of item in list.");
             return null;
         }
    }

    public int size() {
        return this.objArr.length;
    }

    public void remove(Object o) {
        Object[] result = new Object[this.objArr.length-1];
        int index = 0;
        for (int i = 0; i < this.objArr.length; i++) {
            if (o.equals(this.objArr[i])) {
                index = i;

            }
        }
        for (int i = 0, c = 0; i < this.objArr.length; i++) {
            if (i != index) {
                result[c] = this.objArr[i];
                c++;
            }
        }

        this.objArr = result;
    }

    public void removeAll() {
        this.objArr = new Object[0];
    }


    public void addAsFirst(Object o) {
        Object[] temp = new Object[this.objArr.length+1];
        temp[0] = o;

        for (int i = 1, c = 0; i < objArr.length; i++) {
            temp[i] = this.objArr[c];
            c++;
        }
        this.objArr = temp;
    }





}
