package features.songs.presentation;

import features.songs.domain.GetSongUseCase;
import features.songs.domain.Song;

import java.util.ArrayList;

public class SongView {

    public static void printSong (){

        GetSongUseCase getSongUseCase = new GetSongUseCase();

        ArrayList < Song> songArrayList = getSongUseCase.execute();

        System.out.println(songArrayList);
    }
}
