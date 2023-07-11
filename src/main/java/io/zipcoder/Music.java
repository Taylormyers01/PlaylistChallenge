package io.zipcoder;

public class Music {

    private String[] playList;
    private int currentIndex;

    public Music(String[] playList){
        this.playList = playList;
    }

    public Integer selection(Integer startIndex, String selection){
        int nextSongNum = 0;
        int prevSongNum = 0;
        this.currentIndex = startIndex;
        while(!playList[currentIndex].equals(selection)){
            nextSong();
            nextSongNum++;
        }
        this.currentIndex = startIndex;
        while(!playList[currentIndex].equals(selection)){
            previousSong();
            prevSongNum++;
        }
        if(prevSongNum<nextSongNum){
            return prevSongNum;
        }
        return nextSongNum;
    }

    private void nextSong(){
        if(this.currentIndex >= playList.length){
            this.currentIndex = 0;
        }
        else{
            this.currentIndex++;
        }
    }
    public void previousSong(){
        if(this.currentIndex == 0){
            this.currentIndex = playList.length-1;
        }
        else{
            this.currentIndex--;
        }
    }
}
