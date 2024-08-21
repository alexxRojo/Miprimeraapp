package com.example.exampleapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.exampleapp.ui.theme.ExampleAppTheme
import javax.security.cert.Certificate

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ExampleAppTheme {

                }
            }
    }
}
@Composable
fun CertificatingCourse(nombre:String, modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(10.dp),


        verticalArrangement = Arrangement.Center,
        //horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row{
            Spacer(modifier=Modifier.height(300.dp))
            Image(
                painter = painterResource(id = R.drawable.logo_unam),
                contentDescription = null,
                modifier = modifier.size(50.dp,50.dp),
            )

            Spacer(modifier = Modifier.width(40.dp))
            Text(
                text = " Facultad de Ingeniería",
                fontSize=20.sp,
                textAlign=TextAlign.Center
            )
            Spacer(modifier = Modifier.width(30.dp))
             Image(
                   painter= painterResource(id = R.drawable.escudo_fi_color),
                 contentDescription = null,
                  modifier.size(50.dp, 50.dp)
                  )

        }


        Box {

            Spacer(modifier=Modifier.height(90.dp))
            Image(
                painter = painterResource(id = R.drawable.android_logo),
                contentDescription = null,
                modifier = modifier.fillMaxWidth(),
                alpha = 0.2F
            )

            Text(
                text = "$nombre",
                fontSize = 25.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center,
                modifier = modifier.fillMaxWidth()
            )

        }

            Spacer(modifier = modifier.height(25.dp))
            Text(text = "has successfully completed" + "a 2 hours course on")

    }
}

@Composable
@Preview(showBackground = true)
fun CertificatingCoursePreview(){
    CertificatingCourse(nombre= "Alexandra Rojo Rivera")
}