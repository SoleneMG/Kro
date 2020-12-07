package exo15;

public class KroMap {
    int[] boardOfKey = new int[0];
    double[] boardOfValue = new double[0];

    public void put(int key, double value) {
        int[] newBoardOfKey = new int[boardOfKey.length + 1];
        double[] newBoardOfValue = new double[boardOfValue.length + 1];
        for (int i = 0; i < boardOfKey.length; i++) {
            newBoardOfKey[i] = boardOfKey[i];
            newBoardOfValue[i] = boardOfValue[i];
        }
        newBoardOfKey[boardOfKey.length] = key;
        newBoardOfValue[boardOfValue.length] = value;
        boardOfKey = newBoardOfKey;
        boardOfValue = newBoardOfValue;
    }

    public void remove(int key) {
        int indexKey = -1;
        for (int i = 0; i < boardOfKey.length; i++) {
            if (boardOfKey[i] == key) {
                indexKey = i;
                break;
            }
        }
            int[] newBoardOfKey = new int[boardOfKey.length-1];
            double[] newBoardOfValue = new double[boardOfValue.length-1];
            int indexNewBoard = 0;
            for (int y=0; y< boardOfKey.length;y++){
                if(y !=indexKey ){
                   newBoardOfKey[indexNewBoard]=boardOfKey[y];
                   newBoardOfValue[indexNewBoard]=boardOfValue[y];
                   indexNewBoard++;
                }
            }
            boardOfKey = newBoardOfKey;
            boardOfValue = newBoardOfValue;
        }

    public int getSize(){
        return boardOfKey.length;
    }

    public String getValue(int index){
        return boardOfKey[index]+" | "+boardOfValue[index];
    }
}
