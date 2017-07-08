package kenhoang.util;

import javafx.scene.media.AudioClip;

/**
 * Created by kenhoang on 7/8/17.
 */
public class SoundConfig {
    public static final String LOGIN_EXIT = "exit.mp3";
    public static final String LOGIN_ERROR = "falseUserDoubleAccess.mp3";
    public static final String LOGIN_NOT_INPUT_USER = "fogetUser.mp3";


    public static final String MANAGE_ADD = "addSuccessfully.mp3";
    public static final String MANAGE_CHANGE = "changeSuccessfully.mp3";
    public static final String MANAGE_DELETE = "deleteSuccessfully.mp3";
    public static final String MANAGE_INFO_ERROR = "checkLogin1.mp3";

    public static final String CHANGE_PASS_OK = "ChangePassSuccessfully.mp3";
    public static final String CHANGE_PASS_ERROR_PASS_REQUEST = "passWordNewError.mp3";
    public static final String CHANGE_PASS_OLD_INPUT_ERROR = "passWordOldError.mp3";

    public static final String CHANGE_USER_OK = "ChangeUserSuccessfully.mp3";
    public static final String CHANGE_USER_ERROR_PASS_REQUEST = "passWordNotTrue.mp3";
    public static final String CHANGE_USER_ERROR = "UserExisted.mp3";

    private AudioClip audioClip;

    /**
     * play sound dialog
     *
     * @param sound name audio dialog
     */
    public void Voice(String sound) {
        audioClip = new AudioClip(getClass().getResource("/sound/" + sound)
                .toExternalForm());
        audioClip.play();
    }

    public void stop() {
        audioClip.stop();
    }
}
