package main.exo15;

public class KroList {
    String[] boardOfString = new String[0];

    public void add(String value) {
            String[] newBoard = new String[boardOfString.length + 1];
            for (int i = 0; i < boardOfString.length; i++) {
                newBoard[i] = boardOfString[i];
            }
            newBoard[boardOfString.length] = value;
            boardOfString = newBoard;
    }

    public String getValue(int index) {
        return boardOfString[index];
    }

    public void remove(String value) {
        int index = -1;
        for (int i = 0; i < boardOfString.length; i++) {
            if (boardOfString[i].equals(value)) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            String[] newBoard = new String[boardOfString.length - 1];
            int indexNewBoard=0;
            for (int i = 0; i < boardOfString.length; i++) {
                if(i !=index){
                newBoard[indexNewBoard] = boardOfString[i];
                indexNewBoard++;
                }
            }
            boardOfString = newBoard;
        }
    }

    public int size(){
        return boardOfString.length;
    }

    public void addAll(String[] board){
        String[] newBoard = new String[(board.length+ boardOfString.length)];
        for(int i=0; i<boardOfString.length;i++){
            newBoard[i]=boardOfString[i];
        }
        for(int i=0; i<board.length;i++){
        newBoard[boardOfString.length+i]=board[i];
        }
        boardOfString = newBoard;
    }
}
