package com.master.imageupload;

import android.content.Intent;
import android.net.Uri;

import java.io.File;

public interface PickImageDialogInterface {

    void holdRecordingFile(Uri fileUri, File file);

    void handleIntent(Intent intent, int requestCode);

    void uploadPickedImage(File file);
}
