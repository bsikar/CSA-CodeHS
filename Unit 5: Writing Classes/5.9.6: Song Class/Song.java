/* MIT License
 *
 * Copyright (c) 2021 Brighton Sikarskie
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

public class Song {
    private String artist;
    private String title;
    private int minutes;
    private int seconds;

    public Song(String artist, String title, int minutes, int seconds){
        this.artist = artist;
        this.title = title;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    /**
    * Returns value of artist
    * @return artist
    */
    public String getArtist() {
        return artist;
    }

    /**
    * Sets new value of artist
    * @param artist Updated artist
    */
    public void setArtist(String artist) {
        this.artist = artist;
    }

    /**
    * Returns value of title
    * @return title
    */
    public String getTitle() {
        return title;
    }

    /**
    * Sets new value of title
    * @param title Updated title
    */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
    * Returns value of minutes
    * @return minutes
    */
    public int getMinutes() {
        return minutes;
    }

    /**
    * Sets new value of minutes
    * @param minutes Updated minutes
    */
    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    /**
    * Returns value of seconds
    * @return seconds
    */
    public int getSeconds() {
        return seconds;
    }

    /**
    * Sets new value of seconds
    * @param seconds Updated seconds
    */
    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    /**
    * Create string representation of Song for printing
    * @return String of the song
    */
    @Override
    public String toString() {
        return "artist= " + artist + "\ntitle= " + title + "\nTime= " + minutes + ":" + seconds;
    }
}
