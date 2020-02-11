public class List {
    int [] arr = new int[8];
    int items = 0;

    public List(){

    }

    public void addToEnd(int value){
        if (items >= arr.length) { // double the size of the array if need be
            int [] tempArr = new int[arr.length*2];
            System.arraycopy(arr, 0, tempArr, 0, arr.length);
            arr = tempArr;
        }
        arr[items++] = value; // append the item to the last position

    }

    public void addToBeginning(int value){
        if (++items > arr.length) { // double the size of the array if need be
            int [] tempArr = new int[arr.length*2];
            System.arraycopy(arr, 0, tempArr, 0, arr.length);
            arr = tempArr;
        }
        System.arraycopy(arr, 0, arr, 1, items);
        arr[0] = value;
    }

    public String getList(){
        String pprint = "[";
        for (int i = 0; i < items-1; i++) {
            pprint = pprint + arr[i] + ", ";
        }
        pprint = pprint + arr[items-1] + "]";
        return pprint;
    }

    public int getItem(int position){
        return arr[position];
    }

    public String getCapacity(){
        return " (" + items + "/" + arr.length + ")";
    }

    public void deleteItem(int position){
        System.arraycopy(arr, position + 1, arr, position, items - position);
        items--;
    }
}
