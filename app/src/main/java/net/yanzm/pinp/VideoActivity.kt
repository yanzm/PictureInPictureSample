package net.yanzm.pinp

import android.app.PictureInPictureParams
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.ui.Modifier
import net.yanzm.pinp.ui.theme.PictureInPictureSampleTheme

class VideoActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            PictureInPictureSampleTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Column {
                        Button(
                            onClick = {
                                enterPictureInPictureMode(
                                    PictureInPictureParams.Builder()
                                        .build()
                                )
                            }
                        ) {
                            Text("enter PinP")
                        }
                    }
                }
            }
        }
    }
}
